package com.example.android_yx.Activity;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.android_yx.Adapter.FragmentAdapter;
import com.example.android_yx.Fragment.ContactFragment;
import com.example.android_yx.Fragment.DynamicFragment;
import com.example.android_yx.Fragment.MessageFragment;
import com.example.android_yx.MyDataCleanManager;
import com.example.android_yx.R;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewPager vp;
    private TabLayout tab;
    private NavigationView dr_nv;
    private DrawerLayout drawer;
    private Toolbar too;
    private ActionBarDrawerToggle toggle;
    private ArrayList<Fragment> fragments;
    private FragmentAdapter adapter;
    private ImageView too_im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initDrawer();
        initFragment();
        initNavidate();
    }

    private void initNavidate() {

        dr_nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.drawer_githup:
                        Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                        intent.putExtra("url", "https://github.com/wapchief");
                        startActivity(intent);

                        break;
                    case R.id.drawer_csdn:
                        Intent intent1 = new Intent(MainActivity.this, WebViewActivity.class);
                        intent1.putExtra("url", "http://blog.csdn.net/wapchief");
                        startActivity(intent1);

                        break;
                    case R.id.drawer_brief:
                        Intent intent2 = new Intent(MainActivity.this, WebViewActivity.class);
                        intent2.putExtra("url", "http://www.jianshu.com/users/9f0bedd0835c");
                        startActivity(intent2);
                        break;
                    case R.id.drawer_githupi:
                        Intent intent3 = new Intent(MainActivity.this, WebViewActivity.class);
                        intent3.putExtra("url", "http://wapchief.github.io");
                        startActivity(intent3);
                        break;
                    case R.id.str:
                        startActivity(new Intent(MainActivity.this,StringsActivity.class));
                        break;
                    case R.id.about:
                        startActivity(new Intent(MainActivity.this,AboutActivity.class));
                        break;
                    case R.id.delete:
                        String size = null;
                        try {
                            size = MyDataCleanManager.getTotalCacheSize(getApplicationContext());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        showShort(size);
                        break;
                    default:
                        break;

                }

                return true;
            }
        });

    }


    private void initFragment() {
        fragments = new ArrayList<>();
        fragments.add(new ContactFragment());
        fragments.add(new DynamicFragment());
        fragments.add(new MessageFragment());
        adapter = new FragmentAdapter(getSupportFragmentManager(), fragments);
        vp.setAdapter(adapter);
        tab.setupWithViewPager(vp);
        tab.getTabAt(0).setIcon(R.mipmap.icon_tab_message).setText("消息");
        tab.getTabAt(1).setIcon(R.mipmap.icon_tab_im).setText("联系人");
        tab.getTabAt(2).setIcon(R.mipmap.icon_tab_d).setText("动态");
    }

    private void initDrawer() {
        dr_nv.setItemIconTintList(null);
        toggle = new ActionBarDrawerToggle(this, drawer, too, R.string.app_name, R.string.app_name);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }

    private void initView() {

        vp = (ViewPager) findViewById(R.id.vp);
        tab = (TabLayout) findViewById(R.id.tab);
        dr_nv = (NavigationView) findViewById(R.id.dr_nv);
        drawer = (DrawerLayout) findViewById(R.id.drawer);
        too = (Toolbar) findViewById(R.id.too);
        too_im = (ImageView) findViewById(R.id.too_im);
        too_im.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.too_im:
                initPopu();
                break;
            default:
                break;
        }
    }

    private void initPopu() {
        // 初始化popuwindow 布局
        View view = View.inflate(this, R.layout.popu_view2, null);
        //找控件
        Button group = view.findViewById(R.id.group);
        Button add = view.findViewById(R.id.add);
        //创建popu
        final PopupWindow window = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        window.setBackgroundDrawable(new BitmapDrawable());
//        点击外部消失
        window.setOutsideTouchable(true);
        group.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Group_Create_Activty.class));

                //关闭popu
                window.dismiss();
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AddFriendsActivity.class));

                //关闭popu
                window.dismiss();
            }
        });

        window.dismiss();
        // 弹出位置
        window.showAsDropDown(too_im);
    }

    /**
     * 单击回退
     *
     * @param keyCode
     * @param event
     * @return
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exitBy2Click();
        }
        return false;
    }

    /**
     * 双击退出
     */
    private static Boolean isExit = false;

    private void exitBy2Click() {
        Timer tExit = null;
        if (isExit == false) {
            isExit = true; // 准备退出
            showShort("再按一次退出程序");
            tExit = new Timer();
            tExit.schedule(new TimerTask() {
                @Override
                public void run() {
                    isExit = false; // 取消退出
                }
            }, 2000); // 如果2秒钟内没有按下返回键，则启动定时器取消掉刚才执行的任务

        } else {
            finish();
            System.exit(0);
        }
    }

    public void showShort(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
