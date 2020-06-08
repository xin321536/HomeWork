package com.example.adapter.entity;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.List;

public class Bean {
    /**
     * data : {"curPage":2,"datas":[{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13770,"link":"https://mp.weixin.qq.com/s/kmvn637E56t1bae2jXgqfw","niceDate":"2020-06-04 00:00","niceShareDate":"2020-06-04 22:53","origin":"","prefix":"","projectLink":"","publishTime":1591200000000,"selfVisible":0,"shareDate":1591282409000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"Android秀翻天的操作&mdash;&mdash;使用协程进行网络请求","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13752,"link":"https://mp.weixin.qq.com/s/YW1rGpH4vT5zmLMAS1T-mg","niceDate":"2020-06-03 00:00","niceShareDate":"2020-06-03 22:48","origin":"","prefix":"","projectLink":"","publishTime":1591113600000,"selfVisible":0,"shareDate":1591195706000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"如何解决 if&hellip;else 过多的问题","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13753,"link":"https://mp.weixin.qq.com/s/eU25oon1I3MC-bCoiF9r8Q","niceDate":"2020-06-03 00:00","niceShareDate":"2020-06-03 22:48","origin":"","prefix":"","projectLink":"","publishTime":1591113600000,"selfVisible":0,"shareDate":1591195734000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"插件化技术的演进之路","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13755,"link":"https://mp.weixin.qq.com/s/5U-nTNJp_7Z5J11Xyj17HA","niceDate":"2020-06-03 00:00","niceShareDate":"2020-06-03 22:49","origin":"","prefix":"","projectLink":"","publishTime":1591113600000,"selfVisible":0,"shareDate":1591195778000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"巧用MVVM搭建GitHub客户端","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":171,"chapterName":"binder","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13736,"link":"https://juejin.im/post/5ed64bbde51d4578732e75a1","niceDate":"2020-06-02 21:56","niceShareDate":"2020-06-02 21:03","origin":"","prefix":"","projectLink":"","publishTime":1591106210000,"selfVisible":0,"shareDate":1591103036000,"shareUser":"Zaylour","superChapterId":173,"superChapterName":"framework","tags":[],"title":"浅析Binder","type":0,"userId":9778,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":232,"chapterName":"入门及知识点","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13737,"link":"https://www.jianshu.com/p/b799b63f29e2","niceDate":"2020-06-02 21:31","niceShareDate":"2020-06-02 21:23","origin":"","prefix":"","projectLink":"","publishTime":1591104714000,"selfVisible":0,"shareDate":1591104229000,"shareUser":"鸿洋","superChapterId":232,"superChapterName":"Kotlin","tags":[],"title":"Kotlin Coroutine 探索之旅","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":232,"chapterName":"入门及知识点","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13738,"link":"https://www.jianshu.com/p/c515efb9a075","niceDate":"2020-06-02 21:31","niceShareDate":"2020-06-02 21:24","origin":"","prefix":"","projectLink":"","publishTime":1591104707000,"selfVisible":0,"shareDate":1591104299000,"shareUser":"鸿洋","superChapterId":232,"superChapterName":"Kotlin","tags":[],"title":"Kotlin Vocabulary | 揭秘协程中的 suspend 修饰符","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":298,"chapterName":"我的博客","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13739,"link":"https://wanandroid.com/blog/show/2766","niceDate":"2020-06-02 21:31","niceShareDate":"2020-06-02 21:27","origin":"","prefix":"","projectLink":"","publishTime":1591104700000,"selfVisible":0,"shareDate":1591104472000,"shareUser":"","superChapterId":298,"superChapterName":"原创文章","tags":[],"title":"Android  &quot;退一步&quot;的布局加载优化","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13727,"link":"https://juejin.im/post/5ed3219bf265da77190bbb9e","niceDate":"2020-06-02 09:52","niceShareDate":"2020-06-02 09:52","origin":"","prefix":"","projectLink":"","publishTime":1591062725000,"selfVisible":0,"shareDate":1591062725000,"shareUser":"程序有点猿","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android插件化探索二","type":0,"userId":65389,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"谷歌开发者","canEdit":false,"chapterId":415,"chapterName":"谷歌开发者","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13741,"link":"https://mp.weixin.qq.com/s/W69qHo0bBuDgob4_WSkaSw","niceDate":"2020-06-02 00:00","niceShareDate":"2020-06-02 23:01","origin":"","prefix":"","projectLink":"","publishTime":1591027200000,"selfVisible":0,"shareDate":1591110070000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/415/1"}],"title":"Android Studio 4.0+ 中新的 UI 层次结构调试工具","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13742,"link":"https://mp.weixin.qq.com/s/xrIlX7JMouyogTsc5oFeXw","niceDate":"2020-06-02 00:00","niceShareDate":"2020-06-02 23:01","origin":"","prefix":"","projectLink":"","publishTime":1591027200000,"selfVisible":0,"shareDate":1591110087000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"Android 升级适配爬坑历程","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13743,"link":"https://mp.weixin.qq.com/s/ceXsH06fUFa7y4lzi4uXzw","niceDate":"2020-06-02 00:00","niceShareDate":"2020-06-02 23:01","origin":"","prefix":"","projectLink":"","publishTime":1591027200000,"selfVisible":0,"shareDate":1591110106000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"&ldquo;手把手&rdquo;的性能优化文章来了！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"互联网侦察","canEdit":false,"chapterId":421,"chapterName":"互联网侦察","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13744,"link":"https://mp.weixin.qq.com/s/H-p2-JgHg-aldiXmXop4Rw","niceDate":"2020-06-02 00:00","niceShareDate":"2020-06-02 23:02","origin":"","prefix":"","projectLink":"","publishTime":1591027200000,"selfVisible":0,"shareDate":1591110121000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/421/1"}],"title":"如何实现一个高性能可渲染大数据的Tree组件","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13745,"link":"https://mp.weixin.qq.com/s/IlaTEcC8qEIWAcx2GDY1wA","niceDate":"2020-06-02 00:00","niceShareDate":"2020-06-02 23:02","origin":"","prefix":"","projectLink":"","publishTime":1591027200000,"selfVisible":0,"shareDate":1591110135000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"时隔两年，LitePal终于又更新了！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13716,"link":"https://www.jianshu.com/p/bf2f33b2b5ef","niceDate":"2020-06-01 17:34","niceShareDate":"2020-06-01 17:34","origin":"","prefix":"","projectLink":"","publishTime":1591004063000,"selfVisible":0,"shareDate":1591004063000,"shareUser":"i校长","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Flutter Provider 迄今为止更深、更全、更新的源码分析","type":0,"userId":62726,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13714,"link":"https://baiyuliang.blog.csdn.net/article/details/106473684","niceDate":"2020-06-01 15:47","niceShareDate":"2020-06-01 15:47","origin":"","prefix":"","projectLink":"","publishTime":1590997664000,"selfVisible":0,"shareDate":1590997664000,"shareUser":"baiyuliang","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Kotlin+MVVM+Retrofit+协程+ViewBinding+EventBus","type":0,"userId":60831,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13713,"link":"https://weilu.blog.csdn.net/article/details/106465792","niceDate":"2020-06-01 14:41","niceShareDate":"2020-06-01 14:41","origin":"","prefix":"","projectLink":"","publishTime":1590993670000,"selfVisible":0,"shareDate":1590993670000,"shareUser":"唯鹿","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"玩玩Flutter Web &mdash;&mdash; 实现高德地图插件","type":0,"userId":2657,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13712,"link":"https://www.jianshu.com/p/6cd326d4a4b8","niceDate":"2020-06-01 14:15","niceShareDate":"2020-06-01 14:15","origin":"","prefix":"","projectLink":"","publishTime":1590992108000,"selfVisible":0,"shareDate":1590992108000,"shareUser":"xiaolei543","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android 史诗级短视频开源SDK","type":0,"userId":28801,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13705,"link":"https://mp.weixin.qq.com/s/KnmEkmGX77jxEdUZMts4IA","niceDate":"2020-06-01 08:29","niceShareDate":"2020-06-01 08:29","origin":"","prefix":"","projectLink":"","publishTime":1590971392000,"selfVisible":0,"shareDate":1590971392000,"shareUser":"飞洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"🔥你想要的系列：网络请求框架OkHttp3全解系列 -（三）拦截器详解1：重试重定向、桥、缓存（重点）","type":0,"userId":31360,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"venshine","canEdit":false,"chapterId":358,"chapterName":"项目基础功能","collect":false,"courseId":13,"desc":"反编译APK工具，支持Apktool : v2.4.1，dex2jar : v2.1，jd-gui : v1.6.6，jadx : v1.1.0，android-classyshark : v8.2，bytecode-viewer : v2.9.22","descMd":"","envelopePic":"https://www.wanandroid.com/resources/image/pc/default_project_img.jpg","fresh":false,"id":13704,"link":"https://www.wanandroid.com/blog/show/2765","niceDate":"2020-06-01 00:57","niceShareDate":"2020-06-01 00:57","origin":"","prefix":"","projectLink":"https://github.com/venshine/decompile-apk","publishTime":1590944242000,"selfVisible":0,"shareDate":1590944242000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=358"}],"title":"反编译APK","type":0,"userId":-1,"visible":1,"zan":0}],"offset":20,"over":false,"pageCount":432,"size":20,"total":8628}
     * errorCode : 0
     * errorMsg :
     */

    private DataBean data;
    private int errorCode;
    private String errorMsg;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public static class DataBean {
        /**
         * curPage : 2
         * datas : [{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13770,"link":"https://mp.weixin.qq.com/s/kmvn637E56t1bae2jXgqfw","niceDate":"2020-06-04 00:00","niceShareDate":"2020-06-04 22:53","origin":"","prefix":"","projectLink":"","publishTime":1591200000000,"selfVisible":0,"shareDate":1591282409000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"Android秀翻天的操作&mdash;&mdash;使用协程进行网络请求","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13752,"link":"https://mp.weixin.qq.com/s/YW1rGpH4vT5zmLMAS1T-mg","niceDate":"2020-06-03 00:00","niceShareDate":"2020-06-03 22:48","origin":"","prefix":"","projectLink":"","publishTime":1591113600000,"selfVisible":0,"shareDate":1591195706000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"如何解决 if&hellip;else 过多的问题","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13753,"link":"https://mp.weixin.qq.com/s/eU25oon1I3MC-bCoiF9r8Q","niceDate":"2020-06-03 00:00","niceShareDate":"2020-06-03 22:48","origin":"","prefix":"","projectLink":"","publishTime":1591113600000,"selfVisible":0,"shareDate":1591195734000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"插件化技术的演进之路","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13755,"link":"https://mp.weixin.qq.com/s/5U-nTNJp_7Z5J11Xyj17HA","niceDate":"2020-06-03 00:00","niceShareDate":"2020-06-03 22:49","origin":"","prefix":"","projectLink":"","publishTime":1591113600000,"selfVisible":0,"shareDate":1591195778000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"巧用MVVM搭建GitHub客户端","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":171,"chapterName":"binder","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13736,"link":"https://juejin.im/post/5ed64bbde51d4578732e75a1","niceDate":"2020-06-02 21:56","niceShareDate":"2020-06-02 21:03","origin":"","prefix":"","projectLink":"","publishTime":1591106210000,"selfVisible":0,"shareDate":1591103036000,"shareUser":"Zaylour","superChapterId":173,"superChapterName":"framework","tags":[],"title":"浅析Binder","type":0,"userId":9778,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":232,"chapterName":"入门及知识点","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13737,"link":"https://www.jianshu.com/p/b799b63f29e2","niceDate":"2020-06-02 21:31","niceShareDate":"2020-06-02 21:23","origin":"","prefix":"","projectLink":"","publishTime":1591104714000,"selfVisible":0,"shareDate":1591104229000,"shareUser":"鸿洋","superChapterId":232,"superChapterName":"Kotlin","tags":[],"title":"Kotlin Coroutine 探索之旅","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":232,"chapterName":"入门及知识点","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13738,"link":"https://www.jianshu.com/p/c515efb9a075","niceDate":"2020-06-02 21:31","niceShareDate":"2020-06-02 21:24","origin":"","prefix":"","projectLink":"","publishTime":1591104707000,"selfVisible":0,"shareDate":1591104299000,"shareUser":"鸿洋","superChapterId":232,"superChapterName":"Kotlin","tags":[],"title":"Kotlin Vocabulary | 揭秘协程中的 suspend 修饰符","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":298,"chapterName":"我的博客","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13739,"link":"https://wanandroid.com/blog/show/2766","niceDate":"2020-06-02 21:31","niceShareDate":"2020-06-02 21:27","origin":"","prefix":"","projectLink":"","publishTime":1591104700000,"selfVisible":0,"shareDate":1591104472000,"shareUser":"","superChapterId":298,"superChapterName":"原创文章","tags":[],"title":"Android  &quot;退一步&quot;的布局加载优化","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13727,"link":"https://juejin.im/post/5ed3219bf265da77190bbb9e","niceDate":"2020-06-02 09:52","niceShareDate":"2020-06-02 09:52","origin":"","prefix":"","projectLink":"","publishTime":1591062725000,"selfVisible":0,"shareDate":1591062725000,"shareUser":"程序有点猿","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android插件化探索二","type":0,"userId":65389,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"谷歌开发者","canEdit":false,"chapterId":415,"chapterName":"谷歌开发者","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13741,"link":"https://mp.weixin.qq.com/s/W69qHo0bBuDgob4_WSkaSw","niceDate":"2020-06-02 00:00","niceShareDate":"2020-06-02 23:01","origin":"","prefix":"","projectLink":"","publishTime":1591027200000,"selfVisible":0,"shareDate":1591110070000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/415/1"}],"title":"Android Studio 4.0+ 中新的 UI 层次结构调试工具","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13742,"link":"https://mp.weixin.qq.com/s/xrIlX7JMouyogTsc5oFeXw","niceDate":"2020-06-02 00:00","niceShareDate":"2020-06-02 23:01","origin":"","prefix":"","projectLink":"","publishTime":1591027200000,"selfVisible":0,"shareDate":1591110087000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"Android 升级适配爬坑历程","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13743,"link":"https://mp.weixin.qq.com/s/ceXsH06fUFa7y4lzi4uXzw","niceDate":"2020-06-02 00:00","niceShareDate":"2020-06-02 23:01","origin":"","prefix":"","projectLink":"","publishTime":1591027200000,"selfVisible":0,"shareDate":1591110106000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"&ldquo;手把手&rdquo;的性能优化文章来了！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"互联网侦察","canEdit":false,"chapterId":421,"chapterName":"互联网侦察","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13744,"link":"https://mp.weixin.qq.com/s/H-p2-JgHg-aldiXmXop4Rw","niceDate":"2020-06-02 00:00","niceShareDate":"2020-06-02 23:02","origin":"","prefix":"","projectLink":"","publishTime":1591027200000,"selfVisible":0,"shareDate":1591110121000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/421/1"}],"title":"如何实现一个高性能可渲染大数据的Tree组件","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13745,"link":"https://mp.weixin.qq.com/s/IlaTEcC8qEIWAcx2GDY1wA","niceDate":"2020-06-02 00:00","niceShareDate":"2020-06-02 23:02","origin":"","prefix":"","projectLink":"","publishTime":1591027200000,"selfVisible":0,"shareDate":1591110135000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"时隔两年，LitePal终于又更新了！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13716,"link":"https://www.jianshu.com/p/bf2f33b2b5ef","niceDate":"2020-06-01 17:34","niceShareDate":"2020-06-01 17:34","origin":"","prefix":"","projectLink":"","publishTime":1591004063000,"selfVisible":0,"shareDate":1591004063000,"shareUser":"i校长","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Flutter Provider 迄今为止更深、更全、更新的源码分析","type":0,"userId":62726,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13714,"link":"https://baiyuliang.blog.csdn.net/article/details/106473684","niceDate":"2020-06-01 15:47","niceShareDate":"2020-06-01 15:47","origin":"","prefix":"","projectLink":"","publishTime":1590997664000,"selfVisible":0,"shareDate":1590997664000,"shareUser":"baiyuliang","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Kotlin+MVVM+Retrofit+协程+ViewBinding+EventBus","type":0,"userId":60831,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13713,"link":"https://weilu.blog.csdn.net/article/details/106465792","niceDate":"2020-06-01 14:41","niceShareDate":"2020-06-01 14:41","origin":"","prefix":"","projectLink":"","publishTime":1590993670000,"selfVisible":0,"shareDate":1590993670000,"shareUser":"唯鹿","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"玩玩Flutter Web &mdash;&mdash; 实现高德地图插件","type":0,"userId":2657,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13712,"link":"https://www.jianshu.com/p/6cd326d4a4b8","niceDate":"2020-06-01 14:15","niceShareDate":"2020-06-01 14:15","origin":"","prefix":"","projectLink":"","publishTime":1590992108000,"selfVisible":0,"shareDate":1590992108000,"shareUser":"xiaolei543","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android 史诗级短视频开源SDK","type":0,"userId":28801,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13705,"link":"https://mp.weixin.qq.com/s/KnmEkmGX77jxEdUZMts4IA","niceDate":"2020-06-01 08:29","niceShareDate":"2020-06-01 08:29","origin":"","prefix":"","projectLink":"","publishTime":1590971392000,"selfVisible":0,"shareDate":1590971392000,"shareUser":"飞洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"🔥你想要的系列：网络请求框架OkHttp3全解系列 -（三）拦截器详解1：重试重定向、桥、缓存（重点）","type":0,"userId":31360,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"venshine","canEdit":false,"chapterId":358,"chapterName":"项目基础功能","collect":false,"courseId":13,"desc":"反编译APK工具，支持Apktool : v2.4.1，dex2jar : v2.1，jd-gui : v1.6.6，jadx : v1.1.0，android-classyshark : v8.2，bytecode-viewer : v2.9.22","descMd":"","envelopePic":"https://www.wanandroid.com/resources/image/pc/default_project_img.jpg","fresh":false,"id":13704,"link":"https://www.wanandroid.com/blog/show/2765","niceDate":"2020-06-01 00:57","niceShareDate":"2020-06-01 00:57","origin":"","prefix":"","projectLink":"https://github.com/venshine/decompile-apk","publishTime":1590944242000,"selfVisible":0,"shareDate":1590944242000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=358"}],"title":"反编译APK","type":0,"userId":-1,"visible":1,"zan":0}]
         * offset : 20
         * over : false
         * pageCount : 432
         * size : 20
         * total : 8628
         */

        private int curPage;
        private int offset;
        private boolean over;
        private int pageCount;
        private int size;
        private int total;
        private List<DatasBean> datas;

        public int getCurPage() {
            return curPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public boolean isOver() {
            return over;
        }

        public void setOver(boolean over) {
            this.over = over;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<DatasBean> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
        }

        public static class DatasBean implements MultiItemEntity {
            public static final int MULTI_1 = 0;
            public static final int MULTI_2 = 1;
            public static final int MULTI_3 = 2;

            private int mItemType;

            public void setItemtType(int type) {
                this.mItemType = type;
            }

            @Override
            public int getItemType() {
                return mItemType;
            }
            /**
             * apkLink :
             * audit : 1
             * author : 郭霖
             * canEdit : false
             * chapterId : 409
             * chapterName : 郭霖
             * collect : false
             * courseId : 13
             * desc :
             * descMd :
             * envelopePic :
             * fresh : false
             * id : 13770
             * link : https://mp.weixin.qq.com/s/kmvn637E56t1bae2jXgqfw
             * niceDate : 2020-06-04 00:00
             * niceShareDate : 2020-06-04 22:53
             * origin :
             * prefix :
             * projectLink :
             * publishTime : 1591200000000
             * selfVisible : 0
             * shareDate : 1591282409000
             * shareUser :
             * superChapterId : 408
             * superChapterName : 公众号
             * tags : [{"name":"公众号","url":"/wxarticle/list/409/1"}]
             * title : Android秀翻天的操作&mdash;&mdash;使用协程进行网络请求
             * type : 0
             * userId : -1
             * visible : 1
             * zan : 0
             */

            private String apkLink;
            private int audit;
            private String author;
            private boolean canEdit;
            private int chapterId;
            private String chapterName;
            private boolean collect;
            private int courseId;
            private String desc;
            private String descMd;
            private String envelopePic;
            private boolean fresh;
            private int id;
            private String link;
            private String niceDate;
            private String niceShareDate;
            private String origin;
            private String prefix;
            private String projectLink;
            private long publishTime;
            private int selfVisible;
            private long shareDate;
            private String shareUser;
            private int superChapterId;
            private String superChapterName;
            private String title;
            private int type;
            private int userId;
            private int visible;
            private int zan;
            private List<TagsBean> tags;

            public String getApkLink() {
                return apkLink;
            }

            public void setApkLink(String apkLink) {
                this.apkLink = apkLink;
            }

            public int getAudit() {
                return audit;
            }

            public void setAudit(int audit) {
                this.audit = audit;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public boolean isCanEdit() {
                return canEdit;
            }

            public void setCanEdit(boolean canEdit) {
                this.canEdit = canEdit;
            }

            public int getChapterId() {
                return chapterId;
            }

            public void setChapterId(int chapterId) {
                this.chapterId = chapterId;
            }

            public String getChapterName() {
                return chapterName;
            }

            public void setChapterName(String chapterName) {
                this.chapterName = chapterName;
            }

            public boolean isCollect() {
                return collect;
            }

            public void setCollect(boolean collect) {
                this.collect = collect;
            }

            public int getCourseId() {
                return courseId;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getDescMd() {
                return descMd;
            }

            public void setDescMd(String descMd) {
                this.descMd = descMd;
            }

            public String getEnvelopePic() {
                return envelopePic;
            }

            public void setEnvelopePic(String envelopePic) {
                this.envelopePic = envelopePic;
            }

            public boolean isFresh() {
                return fresh;
            }

            public void setFresh(boolean fresh) {
                this.fresh = fresh;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getNiceDate() {
                return niceDate;
            }

            public void setNiceDate(String niceDate) {
                this.niceDate = niceDate;
            }

            public String getNiceShareDate() {
                return niceShareDate;
            }

            public void setNiceShareDate(String niceShareDate) {
                this.niceShareDate = niceShareDate;
            }

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public String getPrefix() {
                return prefix;
            }

            public void setPrefix(String prefix) {
                this.prefix = prefix;
            }

            public String getProjectLink() {
                return projectLink;
            }

            public void setProjectLink(String projectLink) {
                this.projectLink = projectLink;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public int getSelfVisible() {
                return selfVisible;
            }

            public void setSelfVisible(int selfVisible) {
                this.selfVisible = selfVisible;
            }

            public long getShareDate() {
                return shareDate;
            }

            public void setShareDate(long shareDate) {
                this.shareDate = shareDate;
            }

            public String getShareUser() {
                return shareUser;
            }

            public void setShareUser(String shareUser) {
                this.shareUser = shareUser;
            }

            public int getSuperChapterId() {
                return superChapterId;
            }

            public void setSuperChapterId(int superChapterId) {
                this.superChapterId = superChapterId;
            }

            public String getSuperChapterName() {
                return superChapterName;
            }

            public void setSuperChapterName(String superChapterName) {
                this.superChapterName = superChapterName;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getVisible() {
                return visible;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public int getZan() {
                return zan;
            }

            public void setZan(int zan) {
                this.zan = zan;
            }

            public List<TagsBean> getTags() {
                return tags;
            }

            public void setTags(List<TagsBean> tags) {
                this.tags = tags;
            }

            public static class TagsBean {
                /**
                 * name : 公众号
                 * url : /wxarticle/list/409/1
                 */

                private String name;
                private String url;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }
    }
}
