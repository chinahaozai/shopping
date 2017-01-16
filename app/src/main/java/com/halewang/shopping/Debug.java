package com.halewang.shopping;

import com.google.gson.Gson;
import com.halewang.shopping.model.bean.compare.ProductBean;

/**
 * Created by halewang on 2016/11/28.
 */

public class Debug {
    public static final boolean IS_DEBUG = false;

    public static ProductBean getLocalData(){
        Gson gson = new Gson();
        ProductBean productBean = gson.fromJson(mLocalData2, ProductBean.class);
        return productBean;
    }

    private static String mLocalData = "{\n" +
            "\t\"error_code\":0,\n" +
            "\t\"reason\":\"success\",\n" +
            "\t\"result\":{\n" +
            "\t\t\"SearchItemsCount\":161238,\n" +
            "\t\t\"ClassList\":\"1130|30236|保温杯,1135|31646|茶具/咖啡具,1128|26967|玻璃杯,1129|24790|陶瓷杯,1126|12677|塑料杯,1195|7848|创意礼品,1132|3893|酒杯/套装,1075|2870|水具,1127|1910|运动水壶,959|1813|家装软饰,1297|1523|旅游用品,1138|1168|一次性餐具,1131|1096|保温壶,1114|878|厨用杂件\",\n" +
            "\t\t\"SearchResultList\":[\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"史努比(SNOOPY)办公保温杯水杯420ML可爱杯子情侣杯DP-58002H\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n7/g16/M00/05/06/rBEbRVNzDdsIAAAAAAGqWJKKKy4AABA4gLgWhgAAapw588.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/998187.html\",\n" +
            "\t\t\t\t\"spprice\":\"29.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"18000\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"史努比(SNOOPY)办公保温杯水杯420ML可爱<font color=\\\"red\\\">杯子<\\/font>情侣杯DP-58002H\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"31514663\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"绿珠lvzhu 450ml食品级304不锈钢材质情侣风格真空保温杯 带茶隔泡茶 便携商务办公车载茶水杯子K153黑色\",\n" +
            "\t\t\t\t\"sppic\":\"http://img11.360buyimg.com/n7/jfs/t1921/93/1057629077/89933/a9652613/563c7c75Ne4f599bc.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/1760966.html\",\n" +
            "\t\t\t\t\"spprice\":\"39.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"10000\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"绿珠lvzhu 450ml食品级304不锈钢材质情侣风格真空保温杯 带茶隔泡茶 便携商务办公车载茶水<font color=\\\"red\\\">杯子<\\/font>K153黑色\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"334387807\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"Zojirushi 日本象印SM-KB48 便携防漏 车载杯 男士女士儿童不锈钢双层真空保温杯子 一键开启 480ML 4色(香槟色)\",\n" +
            "\t\t\t\t\"sppic\":\"http://d8.yihaodianimg.com/N08/M09/08/3E/ChEi1VbnvUuANDeLAAJIBUtuaeI91201_230*230.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.yhd.com/item/23833382\",\n" +
            "\t\t\t\t\"spprice\":\"259.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"象印\",\n" +
            "\t\t\t\t\"siteName\":\"1号店\",\n" +
            "\t\t\t\t\"commentUrl\":\"http://item.yhd.com/item/23833382_1\",\n" +
            "\t\t\t\t\"commentCount\":\"211\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"Zojirushi 日本象印SM-KB48 便携防漏 车载杯 男士女士儿童不锈钢双层真空保温<font color=\\\"red\\\">杯子<\\/font> 一键开启 480ML 4色(香槟色)\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"13\",\n" +
            "\t\t\t\t\"id\":\"343330332\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"Zojirushi 日本象印SM-KB48 便携防漏 车载杯 男士女士儿童不锈钢双层真空保温杯子 一键开启 480ML 4色(香槟色)\",\n" +
            "\t\t\t\t\"sppic\":\"http://d8.yihaodianimg.com/N08/M09/08/3E/ChEi1VbnvUuANDeLAAJIBUtuaeI91201_230*230.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.yhd.com/item/27346047\",\n" +
            "\t\t\t\t\"spprice\":\"259.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"象印\",\n" +
            "\t\t\t\t\"siteName\":\"1号店\",\n" +
            "\t\t\t\t\"commentUrl\":\"http://item.yhd.com/item/27346047_1\",\n" +
            "\t\t\t\t\"commentCount\":\"211\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"Zojirushi 日本象印SM-KB48 便携防漏 车载杯 男士女士儿童不锈钢双层真空保温<font color=\\\"red\\\">杯子<\\/font> 一键开启 480ML 4色(香槟色)\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"13\",\n" +
            "\t\t\t\t\"id\":\"502800973\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"哈尔斯 500ml不锈钢真空保温户外旅行带提绳子弹头水杯子 HB-500F(迪士尼红\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t1993/12/1144671867/61303/299dabf8/56442fcbN376c44ad.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/1774335.html\",\n" +
            "\t\t\t\t\"spprice\":\"49.90\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"哈尔斯\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"75079\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"哈尔斯 500ml不锈钢真空保温户外旅行带提绳子弹头水杯子 HB-500F(迪士尼红\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"223785887\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"哈尔斯 500ml不锈钢真空保温户外旅行带提绳子弹头水杯子 HB-500F(本色)\",\n" +
            "\t\t\t\t\"sppic\":\"http://img14.360buyimg.com/n7/jfs/t1015/216/1225526156/55835/9a766197/55891c42N823a7f31.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/200889.html\",\n" +
            "\t\t\t\t\"spprice\":\"39.90\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"哈尔斯\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"68000\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"哈尔斯 500ml不锈钢真空保温户外旅行带提绳子弹头水杯子 HB-500F(本色)\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"3009653\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"膳魔师(THERMOS)高真空不锈钢 时尚保温/保冷水杯 保温杯子JNL-502 500ml 粉色JNL-500 500ml 桔色\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t2401/228/2485270035/74132/108773d4/56d7f291Nde432f47.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/2452601.html\",\n" +
            "\t\t\t\t\"spprice\":\"238.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"膳魔师\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"100\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"膳魔师(THERMOS)高真空不锈钢 时尚保温/保冷水杯 保温<font color=\\\"red\\\">杯子<\\/font>JNL-502 500ml 粉色JNL-500 500ml 桔色\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"381934820\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"膳魔师(THERMOS)高真空不锈钢 时尚保温/保冷水杯 保温杯子JNL-502 500ml 粉色JNL-502 500ml 白色\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t2602/210/1631746812/74090/fbacc531/57453b4fNb2047bac.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/2669352.html\",\n" +
            "\t\t\t\t\"spprice\":\"269.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"膳魔师\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"600\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"膳魔师(THERMOS)高真空不锈钢 时尚保温/保冷水杯 保温<font color=\\\"red\\\">杯子<\\/font>JNL-502 500ml 粉色JNL-502 500ml 白色\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"440866219\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"膳魔师(THERMOS)高真空不锈钢 时尚保温/保冷水杯 保温杯子JNL-502 500ml 粉色JNL-502 500ml 天蓝色\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t2902/137/1618658051/50875/fee6b38b/5745420eN396af2d2.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/2669354.html\",\n" +
            "\t\t\t\t\"spprice\":\"269.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"膳魔师\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"900\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"膳魔师(THERMOS)高真空不锈钢 时尚保温/保冷水杯 保温<font color=\\\"red\\\">杯子<\\/font>JNL-502 500ml 粉色JNL-502 500ml 天蓝色\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"440866220\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"膳魔师(THERMOS)高真空不锈钢 时尚保温/保冷水杯 保温杯子JNL-502 500ml 粉色\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n7/jfs/t2788/116/1615096252/100996/af159629/574546e9Na9c67a90.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/2645907.html\",\n" +
            "\t\t\t\t\"spprice\":\"269.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"膳魔师\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"1300\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"膳魔师(THERMOS)高真空不锈钢 时尚保温/保冷水杯 保温<font color=\\\"red\\\">杯子<\\/font>JNL-502 500ml 粉色\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"440866216\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"史努比(SNOOPY)办公保温杯水杯420ML可爱杯子情侣杯DP-58002H大肚蓝\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t1429/102/431961692/52207/21776885/5582969bN57bc5731.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/1519788.html\",\n" +
            "\t\t\t\t\"spprice\":\"29.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"1000\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"史努比(SNOOPY)办公保温杯水杯420ML可爱<font color=\\\"red\\\">杯子<\\/font>情侣杯DP-58002H大肚蓝\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"303310781\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"膳魔师(THERMOS)高真空不锈钢 时尚保温/保冷水杯 保温杯子JNL-502 500ml 粉色JNL-751-RBR 750ml 亮红色\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t2887/65/3391074135/77729/1db76bfe/578caa1dNf2df5402.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/1950741.html\",\n" +
            "\t\t\t\t\"spprice\":\"418.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"膳魔师\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"4026\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"膳魔师(THERMOS)高真空不锈钢 时尚保温/保冷水杯 保温<font color=\\\"red\\\">杯子<\\/font>JNL-502 500ml 粉色JNL-751-RBR 750ml 亮红色\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"224180550\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"史努比(SNOOPY)办公保温杯水杯420ML可爱杯子情侣杯DP-58002H粉色\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t865/105/1191232923/49385/69e1d0e3/55829698N5b93eb68.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/1519783.html\",\n" +
            "\t\t\t\t\"spprice\":\"29.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"900\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"史努比(SNOOPY)办公保温杯水杯420ML可爱<font color=\\\"red\\\">杯子<\\/font>情侣杯DP-58002H粉色\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"339444862\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"史努比(SNOOPY)办公保温杯水杯420ML可爱杯子情侣杯DP-58002H果绿\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t1477/55/440057620/46964/3be622f4/55829695N25801316.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/1519769.html\",\n" +
            "\t\t\t\t\"spprice\":\"29.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"700\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"史努比(SNOOPY)办公保温杯水杯420ML可爱<font color=\\\"red\\\">杯子<\\/font>情侣杯DP-58002H果绿\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"339444861\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"绿珠lvzhu 450ml食品级304不锈钢材质情侣风格真空保温杯 带茶隔泡茶 便携商务办公车载茶水杯子K153蓝色\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t2113/177/1040290954/113418/efdf68f/563c7cc2N1e107d0f.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/1760961.html\",\n" +
            "\t\t\t\t\"spprice\":\"39.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"2300\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"绿珠lvzhu 450ml食品级304不锈钢材质情侣风格真空保温杯 带茶隔泡茶 便携商务办公车载茶水<font color=\\\"red\\\">杯子<\\/font>K153蓝色\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"197667429\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"史努比(SNOOPY)办公保温杯水杯420ML可爱杯子情侣杯DP-58002H蓝色\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t907/276/998381775/66679/1d1da3ce/55658416N4d99f652.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/888624.html\",\n" +
            "\t\t\t\t\"spprice\":\"29.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"6000\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"史努比(SNOOPY)办公保温杯水杯420ML可爱<font color=\\\"red\\\">杯子<\\/font>情侣杯DP-58002H蓝色\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"138524748\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"绿珠lvzhu 450ml食品级304不锈钢材质情侣风格真空保温杯 带茶隔泡茶 便携商务办公车载茶水杯子K153绿色\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t2044/7/1022075640/87806/64c63835/563c7c33N87d97ffa.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/1760954.html\",\n" +
            "\t\t\t\t\"spprice\":\"39.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"1700\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"绿珠lvzhu 450ml食品级304不锈钢材质情侣风格真空保温杯 带茶隔泡茶 便携商务办公车载茶水<font color=\\\"red\\\">杯子<\\/font>K153绿色\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"190036705\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"膳魔师(THERMOS)高真空不锈钢 时尚保温/保冷水杯 保温杯子JNL-502 500ml 粉色JNL500 500ml 樱桃粉\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t2395/250/1746178650/110376/f8aef51d/56d7f3dfNcbe86692.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/2452595.html\",\n" +
            "\t\t\t\t\"spprice\":\"238.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"膳魔师\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"100\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"膳魔师(THERMOS)高真空不锈钢 时尚保温/保冷水杯 保温<font color=\\\"red\\\">杯子<\\/font>JNL-502 500ml 粉色JNL500 500ml 樱桃粉\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"381934819\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"膳魔师(THERMOS)高真空不锈钢 时尚保温/保冷水杯 保温杯子JNL-502 500ml 粉色JNL-502-SBR 500ml 红色\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t2602/290/1664007891/51915/4bb927f4/5745430eN8eff0c66.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/2669342.html\",\n" +
            "\t\t\t\t\"spprice\":\"269.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"膳魔师\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"600\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"膳魔师(THERMOS)高真空不锈钢 时尚保温/保冷水杯 保温<font color=\\\"red\\\">杯子<\\/font>JNL-502 500ml 粉色JNL-502-SBR 500ml 红色\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"440866217\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"哈尔斯 500ml不锈钢真空保温户外旅行带提绳子弹头水杯子 HB-500F(浅莲红\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t2890/317/1386211819/58009/8da44b4e/573d31ffN4dd0900e.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/2354933.html\",\n" +
            "\t\t\t\t\"spprice\":\"39.90\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"哈尔斯\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"500\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"哈尔斯 500ml不锈钢真空保温户外旅行带提绳子弹头水杯子 HB-500F(浅莲红\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"402709929\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"史努比(SNOOPY)办公保温杯水杯420ML可爱杯子情侣杯DP-58002H粉红色\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/g16/M00/05/06/rBEbRlNzDWsIAAAAAAFDgJEOjqkAABA3QFfsx0AAUOY778.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/888621.html\",\n" +
            "\t\t\t\t\"spprice\":\"29.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"11000\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"史努比(SNOOPY)办公保温杯水杯420ML可爱<font color=\\\"red\\\">杯子<\\/font>情侣杯DP-58002H粉红色\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"15990112\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"乐扣乐扣(lock&lock)便携马克保温杯 比得兔学生茶隔男女士不锈钢焖烧水杯子 350ml LHC9016B 黑色经典款 300ml 红色\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t3508/136/247550724/80106/79372514/58044254Nb5125af4.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/1383064.html\",\n" +
            "\t\t\t\t\"spprice\":\"65.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"乐扣乐扣\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"1800\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"乐扣乐扣(lock&lock)便携马克保温杯 比得兔学生茶隔男女士不锈钢焖烧水<font color=\\\"red\\\">杯子<\\/font> 350ml LHC9016B 黑色经典款 300ml 红色\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"138930685\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"哈尔斯 500ml不锈钢真空保温户外旅行带提绳子弹头水杯子 HB-500F(迪士尼紫色\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t1990/198/991025094/91812/5fb476b/563c6eebNb9599138.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/1774337.html\",\n" +
            "\t\t\t\t\"spprice\":\"49.90\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"哈尔斯\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"800\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"哈尔斯 500ml不锈钢真空保温户外旅行带提绳子弹头水杯子 HB-500F(迪士尼紫色\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"199971489\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"乐扣乐扣(lock&lock)保温杯 杯子 水杯彩盒四件套(450ML保温杯*2+陶瓷杯+杯刷)LHC4131WRSH604\",\n" +
            "\t\t\t\t\"sppic\":\"http://d7.yihaodianimg.com/N10/M02/A6/96/ChEi2lfscwuAOgmUAAWv30K6OWw78401_230*230.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.yhd.com/item/67156389\",\n" +
            "\t\t\t\t\"spprice\":\"189.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"乐扣乐扣\",\n" +
            "\t\t\t\t\"siteName\":\"1号店\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"42\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"乐扣乐扣(lock&lock)保温杯 <font color=\\\"red\\\">杯子<\\/font> 水杯彩盒四件套(450ML保温杯*2+陶瓷杯+杯刷)LHC4131WRSH604\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"13\",\n" +
            "\t\t\t\t\"id\":\"584466251\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"哈尔斯 500ml不锈钢真空保温户外旅行带提绳子弹头水杯子 HB-500F(香槟金\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t2626/249/1371203070/60938/5c623aae/573d31f5N7fdf7413.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/2354931.html\",\n" +
            "\t\t\t\t\"spprice\":\"39.90\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"哈尔斯\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"200\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"哈尔斯 500ml不锈钢真空保温户外旅行带提绳子弹头水杯子 HB-500F(香槟金\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"402709930\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"乐扣乐扣(lock&lock)便携马克保温杯 比得兔学生茶隔男女士不锈钢焖烧水杯子 350ml LHC9016B 黑色\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n7/jfs/t2470/339/1732693331/143134/1f7a6b67/5670f8f0Na44d4410.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/2201222.html\",\n" +
            "\t\t\t\t\"spprice\":\"79.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"乐扣乐扣\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"3100\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"乐扣乐扣(lock&lock)便携马克保温杯 比得兔学生茶隔男女士不锈钢焖烧水<font color=\\\"red\\\">杯子<\\/font> 350ml LHC9016B 黑色\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"240887640\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"物生物/RELEA 格纹保温杯 不锈钢真空内胆保温水杯 男女水杯子 450ML 珊瑚粉\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t2200/13/2732943101/145450/e609944e/571828b5N8afc537a.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/2532724.html\",\n" +
            "\t\t\t\t\"spprice\":\"79.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"80\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"物生物/RELEA 格纹保温杯 不锈钢真空内胆保温水杯 男女水杯子 450ML 珊瑚粉\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"372393544\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"乐扣乐扣(lock&lock)便携马克保温杯 比得兔学生茶隔男女士不锈钢焖烧水杯子 350ml LHC9016B 黑色经典款 300ml 黑色\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t1162/30/255556765/52168/b1a2d532/5511183eN788e11ae.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/1383042.html\",\n" +
            "\t\t\t\t\"spprice\":\"69.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"乐扣乐扣\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"3600\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"乐扣乐扣(lock&lock)便携马克保温杯 比得兔学生茶隔男女士不锈钢焖烧水<font color=\\\"red\\\">杯子<\\/font> 350ml LHC9016B 黑色经典款 300ml 黑色\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"138930684\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"绿珠lvzhu 450ml食品级304不锈钢材质情侣风格真空保温杯 带茶隔泡茶 便携商务办公车载茶水杯子K153粉色\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t2533/50/209031000/93049/bc445203/563c7beeN5c58f204.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/1760955.html\",\n" +
            "\t\t\t\t\"spprice\":\"39.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"1600\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"绿珠lvzhu 450ml食品级304不锈钢材质情侣风格真空保温杯 带茶隔泡茶 便携商务办公车载茶水<font color=\\\"red\\\">杯子<\\/font>K153粉色\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"196240194\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"物生物/RELEA 格纹保温杯 不锈钢真空内胆保温水杯 男女水杯子 450ML 雨后青\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t2206/14/2742905548/175735/5d759900/5715a929N0825995b.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/2532734.html\",\n" +
            "\t\t\t\t\"spprice\":\"79.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"70\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"物生物/RELEA 格纹保温杯 不锈钢真空内胆保温水杯 男女水杯子 450ML 雨后青\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"372393547\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"物生物/RELEA 格纹保温杯 不锈钢真空内胆保温水杯 男女水杯子 450ML 珍珠白\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t2287/9/2763057529/152662/85e392c0/571828e2Ne972b19d.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/2532571.html\",\n" +
            "\t\t\t\t\"spprice\":\"79.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"80\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"物生物/RELEA 格纹保温杯 不锈钢真空内胆保温水杯 男女水杯子 450ML 珍珠白\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"372393535\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"物生物/RELEA 格纹保温杯 不锈钢真空内胆保温水杯 男女水杯子 450ML 午夜蓝\",\n" +
            "\t\t\t\t\"sppic\":\"http://img10.360buyimg.com/n7/jfs/t2488/329/2763929468/199625/bf5f1f/57182886N86b14f8e.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/2532730.html\",\n" +
            "\t\t\t\t\"spprice\":\"69.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"900\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"物生物/RELEA 格纹保温杯 不锈钢真空内胆保温水杯 男女水杯子 450ML 午夜蓝\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"372393545\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"史努比(SNOOPY)办公保温杯水杯420ML可爱杯子情侣杯DP-58002H绿色\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/g17/M00/02/1F/rBEbSVNzDZEIAAAAAAFZzQpq9csAAAyUQBhUzYAAVnl793.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/888627.html\",\n" +
            "\t\t\t\t\"spprice\":\"29.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"2100\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"史努比(SNOOPY)办公保温杯水杯420ML可爱<font color=\\\"red\\\">杯子<\\/font>情侣杯DP-58002H绿色\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"304983474\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"乐扣乐扣(lock&lock)便携马克保温杯 比得兔学生茶隔男女士不锈钢焖烧水杯子 350ml LHC9016B 黑色300ml 蓝色带杯套\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t289/84/800601058/114313/7bf8e952/5425275dN49b4f095.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/1002422.html\",\n" +
            "\t\t\t\t\"spprice\":\"79.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"乐扣乐扣\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"900\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"乐扣乐扣(lock&lock)便携马克保温杯 比得兔学生茶隔男女士不锈钢焖烧水<font color=\\\"red\\\">杯子<\\/font> 350ml LHC9016B 黑色300ml 蓝色带杯套\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"32427485\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"物生物/RELEA 格纹保温杯 不锈钢真空内胆保温水杯 男女水杯子 450ML 圣诞红\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t2860/146/459832179/163350/cd71d0d/57147a7bNe6d3da32.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/2532591.html\",\n" +
            "\t\t\t\t\"spprice\":\"89.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"1252\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"物生物/RELEA 格纹保温杯 不锈钢真空内胆保温水杯 男女水杯子 450ML 圣诞红\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"372393536\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"哈尔斯 500ml不锈钢真空保温户外旅行带提绳子弹头水杯子 HB-500F(苹果绿\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t2890/227/1352095414/54167/830706d1/573d31d3N1c26bab9.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/2354146.html\",\n" +
            "\t\t\t\t\"spprice\":\"39.90\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"哈尔斯\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"300\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"哈尔斯 500ml不锈钢真空保温户外旅行带提绳子弹头水杯子 HB-500F(苹果绿\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"402709931\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"乐扣乐扣(lock&lock)便携马克保温杯 比得兔学生茶隔男女士不锈钢焖烧水杯子 350ml LHC9016B 黑色300ml 蓝色\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t3616/258/253985926/163259/3209812e/580443afN53317b3a.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/1383035.html\",\n" +
            "\t\t\t\t\"spprice\":\"59.90\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"乐扣乐扣\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"10995\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"乐扣乐扣(lock&lock)便携马克保温杯 比得兔学生茶隔男女士不锈钢焖烧水<font color=\\\"red\\\">杯子<\\/font> 350ml LHC9016B 黑色300ml 蓝色\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"138930683\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"乐扣乐扣(lock&lock)便携马克保温杯 比得兔学生茶隔男女士不锈钢焖烧水杯子 350ml LHC9016B 黑色2016新款 350ml 粉色\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t2281/319/1919352982/101561/32dac4e4/568a0edcN8c6523e4.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/2201220.html\",\n" +
            "\t\t\t\t\"spprice\":\"79.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"乐扣乐扣\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"400\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"乐扣乐扣(lock&lock)便携马克保温杯 比得兔学生茶隔男女士不锈钢焖烧水<font color=\\\"red\\\">杯子<\\/font> 350ml LHC9016B 黑色2016新款 350ml 粉色\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"241343126\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"物生物/RELEA 格纹保温杯 不锈钢真空内胆保温水杯 男女水杯子 450ML 香槟杏\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t2233/240/2977314020/148951/d05d01de/56fbe73bNa23c9cc1.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/2532708.html\",\n" +
            "\t\t\t\t\"spprice\":\"89.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"10\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"物生物/RELEA 格纹保温杯 不锈钢真空内胆保温水杯 男女水杯子 450ML 香槟杏\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"372393542\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"欧橡OAK保温杯商务不锈钢真空男女士水杯子 450ml  黑色  OX-8017\",\n" +
            "\t\t\t\t\"sppic\":\"http://img13.360buyimg.com/n7/jfs/t3211/124/89220864/287533/4ff5b0a2/57a427dfNa986e669.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/1944463.html\",\n" +
            "\t\t\t\t\"spprice\":\"99.00\",\n" +
            "\t\t\t\t\"className\":\"保温杯\",\n" +
            "\t\t\t\t\"brandName\":\"\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"2300\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"欧橡OAK保温杯商务不锈钢真空男女士水杯子 450ml  黑色  OX-8017\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"218367021\"\n" +
            "\t\t\t}\n" +
            "\t\t]\n" +
            "\t}\n" +
            "}";

    private static String mLocalData2 = "{\n" +
            "\t\"error_code\":0,\n" +
            "\t\"reason\":\"success\",\n" +
            "\t\"result\":{\n" +
            "\t\t\"SearchItemsCount\":506,\n" +
            "\t\t\"ClassList\":\"\",\n" +
            "\t\t\"SearchResultList\":[\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"魅族Pro6 全网通32G 香槟金 移动联通电信/4G手机\",\n" +
            "\t\t\t\t\"sppic\":\"http://image1.suning.cn/uimg/b2c/newcatentries/0070079092-000000000146158971_1_200x200.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://product.suning.com/0070079092/146158971.html\",\n" +
            "\t\t\t\t\"spprice\":\"2199.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"苏宁易购\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"4234\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"<font color=\\\"red\\\">魅族<\\/font>Pro6 全网通32G 香槟金 移动联通电信/4G手机\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"6\",\n" +
            "\t\t\t\t\"id\":\"351476926\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"【12期免息赠耳机】Meizu/魅族 PRO 6 全网通公开版pro6手机  移动4G/联通4G/电信4G                                 香槟金                         官方标配 32GB\",\n" +
            "\t\t\t\t\"sppic\":\"https://img.alicdn.com/imgextra/i1/1695308781/TB2j_E0chuI.eBjy0FdXXXgbVXa_!!1695308781.jpg_430x430q90.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.tmall.com/item.htm?id=529707738581\",\n" +
            "\t\t\t\t\"spprice\":\"2299.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"天猫旗舰店(魅族官方旗舰店)\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"13296\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"【12期免息赠耳机】Meizu/<font color=\\\"red\\\">魅族<\\/font> <font color=\\\"red\\\">PRO<\\/font> <font color=\\\"red\\\">6<\\/font> 全网通公开版pro6手机  移动4G/联通4G/电信4G                                 香槟金                         官方标配 3\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"278\",\n" +
            "\t\t\t\t\"id\":\"563331023\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"【12期免息赠耳机】Meizu/魅族 PRO 6 全网通公开版pro6手机  移动4G/联通4G/电信4G                                 香槟金                         官方标配 32GB\",\n" +
            "\t\t\t\t\"sppic\":\"https://img.alicdn.com/imgextra/i1/1695308781/TB2j_E0chuI.eBjy0FdXXXgbVXa_!!1695308781.jpg_430x430q90.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.tmall.com/item.htm?id=529707738581\",\n" +
            "\t\t\t\t\"spprice\":\"2299.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"天猫旗舰店(魅族官方旗舰店)\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"13293\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"【12期免息赠耳机】Meizu/<font color=\\\"red\\\">魅族<\\/font> <font color=\\\"red\\\">PRO<\\/font> <font color=\\\"red\\\">6<\\/font> 全网通公开版pro6手机  移动4G/联通4G/电信4G                                 香槟金                         官方标配 3\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"278\",\n" +
            "\t\t\t\t\"id\":\"532666835\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"魅族 PRO6 32GB 全网通公开版 金色 移动联通电信4G手机 双卡双待\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n7/jfs/t2686/294/337465072/340581/8a260cb6/570e6701N2ae67ce2.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/2660657.html\",\n" +
            "\t\t\t\t\"spprice\":\"2299.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"6500\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"<font color=\\\"red\\\">魅族<\\/font> PRO6 32GB 全网通公开版 金色 移动联通电信4G手机 双卡双待\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"354690188\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"魅族 PRO6 32GB 全网通公开版 玫瑰金 移动联通电信4G手机 双卡双待\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t2773/104/2224818638/332656/52dd8c4f/575faad4Ne869e1f4.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/3129330.html\",\n" +
            "\t\t\t\t\"spprice\":\"2299.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"2600\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"<font color=\\\"red\\\">魅族<\\/font> PRO6 32GB 全网通公开版 玫瑰金 移动联通电信4G手机 双卡双待\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"431649374\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"魅族 (Meizu) Pro6  32GB 金色 移动公开版 移动联通4G手机\",\n" +
            "\t\t\t\t\"sppic\":\"http://img03.fn-mart.com/C/item/2016/0624/201606C240000099/_857337641_230x230.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.feiniu.com/201606CM240000324\",\n" +
            "\t\t\t\t\"spprice\":\"1949.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"飞牛网\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"0\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"<font color=\\\"red\\\">魅族<\\/font> (Meizu) Pro6  32GB 金色 移动公开版 移动联通4G手机\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"161\",\n" +
            "\t\t\t\t\"id\":\"439995303\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"Meizu/魅族 PRO 6 全网通4G 电信 32G 银白\",\n" +
            "\t\t\t\t\"sppic\":\"http://img11.hqbcdn.com/product/9f/29/9f29522b9ef125435ed81a78e06b7f57.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://www.okhqb.com/item/1000124307.html\",\n" +
            "\t\t\t\t\"spprice\":\"1955.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"华强北\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"41\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"Meizu/<font color=\\\"red\\\">魅族<\\/font> <font color=\\\"red\\\">PRO<\\/font> <font color=\\\"red\\\">6<\\/font> 全网通4G 电信 32G 银白\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"123\",\n" +
            "\t\t\t\t\"id\":\"622426822\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"魅族 PRO6 全网通 32GB 银色 移动联通电信4G手机 双卡双待\",\n" +
            "\t\t\t\t\"sppic\":\"http://img3x5.ddimg.cn/79/7/1291845535-1_b_2.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://product.dangdang.com/1291845535.html\",\n" +
            "\t\t\t\t\"spprice\":\"2029.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"当当\",\n" +
            "\t\t\t\t\"commentUrl\":\"http://comm.dangdang.com/review/reviewlist.php?pid=1291845535#ddclick?act=sort_total_review_count_desc&pos=1291845535_26_1_m&cat=4004279&key=&qinfo=&pinfo=&minfo=4349_74_48&ninfo=&custid=&permid=20161130000327461191915653799243009&ref=&rcount=&type=&t=1480435857000&searchapi_version=test_ori\",\n" +
            "\t\t\t\t\"commentCount\":\"13\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"<font color=\\\"red\\\">魅族<\\/font> PRO6 全网通 32GB 银色 移动联通电信4G手机 双卡双待\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"3\",\n" +
            "\t\t\t\t\"id\":\"419964840\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"魅族 PRO6 32GB 金色 移动联通电信4G手机 全网通版 双卡双待\",\n" +
            "\t\t\t\t\"sppic\":\"http://gfs.gomein.net.cn/T1B5YTBCKv1RCvBVdK_160.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.gome.com.cn/9134290551-1123230357.html\",\n" +
            "\t\t\t\t\"spprice\":\"2299.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"国美在线\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"1006\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"<font color=\\\"red\\\">魅族<\\/font> PRO6 32GB 金色 移动联通电信4G手机 全网通版 双卡双待\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"8\",\n" +
            "\t\t\t\t\"id\":\"363665558\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"魅族PRO 6\",\n" +
            "\t\t\t\t\"sppic\":\"http://storeimg.meizu.com/product/1460439990-20010.png\",\n" +
            "\t\t\t\t\"spurl\":\"http://detail.meizu.com/item/meizu_pro6.html\",\n" +
            "\t\t\t\t\"spprice\":\"2299.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"魅族官方商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"0\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"<font color=\\\"red\\\">魅族<\\/font><font color=\\\"red\\\">PRO<\\/font> <font color=\\\"red\\\">6<\\/font>\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"292\",\n" +
            "\t\t\t\t\"id\":\"461878454\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"魅族 PRO6 64GB 星空黑 全网通4G手机\",\n" +
            "\t\t\t\t\"sppic\":\"http://d9.yihaodianimg.com/N10/M06/4F/03/ChEi3FcN5FWAG3cgAAOoNotllQg54601_230*230.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.yhd.com/item/61228276\",\n" +
            "\t\t\t\t\"spprice\":\"2599.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"1号店\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"541\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"<font color=\\\"red\\\">魅族<\\/font> PRO6 64GB 星空黑 全网通4G手机\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"13\",\n" +
            "\t\t\t\t\"id\":\"395487926\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"魅族 PRO6 64GB 玫瑰金 全网通4G手机\",\n" +
            "\t\t\t\t\"sppic\":\"http://d6.yihaodianimg.com/N09/M08/DF/61/ChEi11djS5eACzgvAAPbLmQVQIE49401_230*230.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.yhd.com/item/61320236\",\n" +
            "\t\t\t\t\"spprice\":\"2599.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"1号店\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"541\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"<font color=\\\"red\\\">魅族<\\/font> PRO6 64GB 玫瑰金 全网通4G手机\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"13\",\n" +
            "\t\t\t\t\"id\":\"502579141\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"魅族Pro6 全网通公开版 4+64GB 黑色 移动联通电信4G手机 双卡双待\",\n" +
            "\t\t\t\t\"sppic\":\"http://image3.suning.cn/uimg/b2c/newcatentries/0000000000-000000000146465385_1_200x200.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://product.suning.com/0000000000/146465385.html\",\n" +
            "\t\t\t\t\"spprice\":\"2799.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"苏宁易购\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"1032\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"<font color=\\\"red\\\">魅族<\\/font>Pro6 全网通公开版 4+64GB 黑色 移动联通电信4G手机 双卡双待\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"6\",\n" +
            "\t\t\t\t\"id\":\"446409235\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"魅族 PRO6S 64GB 全网通公开版 星空黑 移动联通电信4G手机 双卡双待\",\n" +
            "\t\t\t\t\"sppic\":\"http://img11.360buyimg.com/n7/jfs/t3505/273/1059115597/202229/f3955e7b/581b0698Nd93ad3ef.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/3888276.html\",\n" +
            "\t\t\t\t\"spprice\":\"2699.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"1193\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"<font color=\\\"red\\\">魅族<\\/font> PRO6S 64GB 全网通公开版 星空黑 移动联通电信4G手机 双卡双待\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"597645553\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"魅族 PRO6 64GB 玫瑰金 全网通4G手机\",\n" +
            "\t\t\t\t\"sppic\":\"http://d6.yihaodianimg.com/N09/M08/DF/61/ChEi11djS5eACzgvAAPbLmQVQIE49401_230*230.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.yhd.com/item/61228271\",\n" +
            "\t\t\t\t\"spprice\":\"2599.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"1号店\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"541\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"<font color=\\\"red\\\">魅族<\\/font> PRO6 64GB 玫瑰金 全网通4G手机\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"13\",\n" +
            "\t\t\t\t\"id\":\"430735267\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"魅族Pro6s全网通版 4+64GB 玫瑰金 双卡双待\",\n" +
            "\t\t\t\t\"sppic\":\"http://gfs3.gomein.net.cn/T155JTB4L_1RCvBVdK_160.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.gome.com.cn/9134560673-1123501462.html\",\n" +
            "\t\t\t\t\"spprice\":\"2699.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"国美在线\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"0\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"<font color=\\\"red\\\">魅族<\\/font>Pro6s全网通版 4+64GB 玫瑰金 双卡双待\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"8\",\n" +
            "\t\t\t\t\"id\":\"620957124\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"魅族 PRO6 64GB 香槟金 全网通4G手机\",\n" +
            "\t\t\t\t\"sppic\":\"http://d9.yihaodianimg.com/N06/M07/16/8F/CgQIzlcN5QqATrbjAAPLkOkGSxA18401_230*230.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.yhd.com/item/61228266\",\n" +
            "\t\t\t\t\"spprice\":\"2599.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"1号店\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"541\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"<font color=\\\"red\\\">魅族<\\/font> PRO6 64GB 香槟金 全网通4G手机\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"13\",\n" +
            "\t\t\t\t\"id\":\"389628216\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"【苏宁直发 12期免息】Meizu/魅族Pro6 全网通4G手机  移动4G/联通4G/电信4G                                 星空黑                         官方标配 64GB\",\n" +
            "\t\t\t\t\"sppic\":\"https://img.alicdn.com/imgextra/i3/2616970884/TB2gAyFnXXXXXb8XXXXXXXXXXXX_!!2616970884.jpg_430x430q90.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.tmall.com/item.htm?id=530188945404&skuId=3176798323805\",\n" +
            "\t\t\t\t\"spprice\":\"2799.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"天猫旗舰店(苏宁易购官方旗舰店)\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"3648\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"【苏宁直发 12期免息】Meizu/<font color=\\\"red\\\">魅族<\\/font>Pro6 全网通4G手机  移动4G/联通4G/电信4G                                 星空黑                         官方标配 64GB\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"278\",\n" +
            "\t\t\t\t\"id\":\"486234718\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"【12期免息赠耳机】Meizu/魅族 PRO 6 全网通公开版pro6手机  移动4G/联通4G/电信4G                                 香槟金                         官方标配 32GB\",\n" +
            "\t\t\t\t\"sppic\":\"https://img.alicdn.com/imgextra/i1/1695308781/TB2j_E0chuI.eBjy0FdXXXgbVXa_!!1695308781.jpg_430x430q90.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.tmall.com/item.htm?id=529707738581\",\n" +
            "\t\t\t\t\"spprice\":\"2299.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"天猫旗舰店(魅族官方旗舰店)\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"13288\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"【12期免息赠耳机】Meizu/<font color=\\\"red\\\">魅族<\\/font> <font color=\\\"red\\\">PRO<\\/font> <font color=\\\"red\\\">6<\\/font> 全网通公开版pro6手机  移动4G/联通4G/电信4G                                 香槟金                         官方标配 3\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"278\",\n" +
            "\t\t\t\t\"id\":\"486235056\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"【12期免息赠耳机】Meizu/魅族 PRO 6全网通电信版_pro6手机  移动4G/联通4G/电信4G                                 月光银                         官方标配 32GB\",\n" +
            "\t\t\t\t\"sppic\":\"https://img.alicdn.com/imgextra/i2/1695308781/TB2d3ELcmKI.eBjy1zcXXXIOpXa_!!1695308781.jpg_430x430q90.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.tmall.com/item.htm?id=533823734168\",\n" +
            "\t\t\t\t\"spprice\":\"2299.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"天猫旗舰店(魅族官方旗舰店)\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"284\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"【12期免息赠耳机】Meizu/<font color=\\\"red\\\">魅族<\\/font> <font color=\\\"red\\\">PRO<\\/font> <font color=\\\"red\\\">6<\\/font>全网通电信版_pro6手机  移动4G/联通4G/电信4G                                 月光银                         官方标配 3\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"278\",\n" +
            "\t\t\t\t\"id\":\"483989444\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"【12期免息赠耳机】Meizu/魅族 PRO 6 全网通公开版pro6手机  移动4G/联通4G/电信4G                                 香槟金                         官方标配 32GB\",\n" +
            "\t\t\t\t\"sppic\":\"https://img.alicdn.com/imgextra/i1/1695308781/TB2j_E0chuI.eBjy0FdXXXgbVXa_!!1695308781.jpg_430x430q90.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.tmall.com/item.htm?id=529707738581\",\n" +
            "\t\t\t\t\"spprice\":\"2299.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"天猫旗舰店(魅族官方旗舰店)\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"13288\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"【12期免息赠耳机】Meizu/<font color=\\\"red\\\">魅族<\\/font> <font color=\\\"red\\\">PRO<\\/font> <font color=\\\"red\\\">6<\\/font> 全网通公开版pro6手机  移动4G/联通4G/电信4G                                 香槟金                         官方标配 3\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"278\",\n" +
            "\t\t\t\t\"id\":\"483989441\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"【12期免息赠耳机】Meizu/魅族 PRO 6 全网通公开版pro6手机  移动4G/联通4G/电信4G                                 香槟金                         官方标配 32GB\",\n" +
            "\t\t\t\t\"sppic\":\"https://img.alicdn.com/imgextra/i1/1695308781/TB2j_E0chuI.eBjy0FdXXXgbVXa_!!1695308781.jpg_430x430q90.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.tmall.com/item.htm?id=529707738581\",\n" +
            "\t\t\t\t\"spprice\":\"2299.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"天猫旗舰店(魅族官方旗舰店)\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"13289\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"【12期免息赠耳机】Meizu/<font color=\\\"red\\\">魅族<\\/font> <font color=\\\"red\\\">PRO<\\/font> <font color=\\\"red\\\">6<\\/font> 全网通公开版pro6手机  移动4G/联通4G/电信4G                                 香槟金                         官方标配 3\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"278\",\n" +
            "\t\t\t\t\"id\":\"500134632\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"魅族Pro6全网通公开版 4+64GB 玫瑰金 移动联通电信4G手机 双卡双待\",\n" +
            "\t\t\t\t\"sppic\":\"http://image2.suning.cn/uimg/b2c/newcatentries/0000000000-000000000184166321_1_200x200.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://product.suning.com/0000000000/184166321.html\",\n" +
            "\t\t\t\t\"spprice\":\"2699.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"苏宁易购\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"0\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"<font color=\\\"red\\\">魅族<\\/font>Pro6全网通公开版 4+64GB 玫瑰金 移动联通电信4G手机 双卡双待\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"6\",\n" +
            "\t\t\t\t\"id\":\"622214327\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"Meizu/魅族 PRO 6 全网通4G 电信 32G 金色\",\n" +
            "\t\t\t\t\"sppic\":\"http://img11.hqbcdn.com/product/9f/29/9f29522b9ef125435ed81a78e06b7f57.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://www.okhqb.com/item/1000124306.html\",\n" +
            "\t\t\t\t\"spprice\":\"1955.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"华强北\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"41\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"Meizu/<font color=\\\"red\\\">魅族<\\/font> <font color=\\\"red\\\">PRO<\\/font> <font color=\\\"red\\\">6<\\/font> 全网通4G 电信 32G 金色\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"123\",\n" +
            "\t\t\t\t\"id\":\"622426821\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"Meizu/魅族 PRO 6 全网通4G 电信 32G 纯黑\",\n" +
            "\t\t\t\t\"sppic\":\"http://img11.hqbcdn.com/product/9f/29/9f29522b9ef125435ed81a78e06b7f57.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://www.okhqb.com/item/1000124305.html\",\n" +
            "\t\t\t\t\"spprice\":\"1988.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"华强北\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"41\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"Meizu/<font color=\\\"red\\\">魅族<\\/font> <font color=\\\"red\\\">PRO<\\/font> <font color=\\\"red\\\">6<\\/font> 全网通4G 电信 32G 纯黑\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"123\",\n" +
            "\t\t\t\t\"id\":\"622426820\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"Meizu/魅族 PRO 6s 全网通 双卡双待 手机 4GB+64GB 玫瑰金\",\n" +
            "\t\t\t\t\"sppic\":\"http://img13.hqbcdn.com/product/f9/83/f983ce12b2101db57e91d832fcf35173.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://www.okhqb.com/item/1000124218.html\",\n" +
            "\t\t\t\t\"spprice\":\"2439.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"华强北\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"0\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"Meizu/<font color=\\\"red\\\">魅族<\\/font> <font color=\\\"red\\\">PRO<\\/font> <font color=\\\"red\\\">6<\\/font>s 全网通 双卡双待 手机 4GB+64GB 玫瑰金\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"123\",\n" +
            "\t\t\t\t\"id\":\"610299847\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"Meizu/魅族 PRO 6s 全网通 双卡双待 手机 4GB+64GB 月光银\",\n" +
            "\t\t\t\t\"sppic\":\"http://img4.hqbcdn.com/product/9f/31/9f31651210fa15a07995a6d949cd092c.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://www.okhqb.com/item/1000124217.html\",\n" +
            "\t\t\t\t\"spprice\":\"2488.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"华强北\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"0\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"Meizu/<font color=\\\"red\\\">魅族<\\/font> <font color=\\\"red\\\">PRO<\\/font> <font color=\\\"red\\\">6<\\/font>s 全网通 双卡双待 手机 4GB+64GB 月光银\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"123\",\n" +
            "\t\t\t\t\"id\":\"610299846\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"魅族 PRO6 64GB 香槟金 全网通4G手机\",\n" +
            "\t\t\t\t\"sppic\":\"http://d9.yihaodianimg.com/N06/M07/16/8F/CgQIzlcN5QqATrbjAAPLkOkGSxA18401_230*230.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.yhd.com/item/61320235\",\n" +
            "\t\t\t\t\"spprice\":\"2599.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"1号店\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"541\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"<font color=\\\"red\\\">魅族<\\/font> PRO6 64GB 香槟金 全网通4G手机\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"13\",\n" +
            "\t\t\t\t\"id\":\"506716704\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"魅族PRO6S全网通公开版 4+64GB 黑色 移动联通电信4G手机 双卡双待\",\n" +
            "\t\t\t\t\"sppic\":\"http://image2.suning.cn/uimg/b2c/newcatentries/0000000000-000000000184166337_1_200x200.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://product.suning.com/0000000000/184166337.html\",\n" +
            "\t\t\t\t\"spprice\":\"2699.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"苏宁易购\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"28\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"<font color=\\\"red\\\">魅族<\\/font>PRO6S全网通公开版 4+64GB 黑色 移动联通电信4G手机 双卡双待\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"6\",\n" +
            "\t\t\t\t\"id\":\"622700759\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"魅族 PRO6S 64GB 全网通公开版 玫瑰金 移动联通电信4G手机 双卡双待\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t3511/316/1204922005/225540/655cccf7/582044f6N17d5005c.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/4067574.html\",\n" +
            "\t\t\t\t\"spprice\":\"2699.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"1193\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"<font color=\\\"red\\\">魅族<\\/font> PRO6S 64GB 全网通公开版 玫瑰金 移动联通电信4G手机 双卡双待\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"606317392\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"魅族 PRO6 32GB 香槟金 全网通4G手机\",\n" +
            "\t\t\t\t\"sppic\":\"http://d9.yihaodianimg.com/N10/M08/B6/8B/ChEi2ldPq1KAI-KeAANTUPQwiAk09301_230*230.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.yhd.com/item/61228243\",\n" +
            "\t\t\t\t\"spprice\":\"2299.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"1号店\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"541\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"<font color=\\\"red\\\">魅族<\\/font> PRO6 32GB 香槟金 全网通4G手机\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"13\",\n" +
            "\t\t\t\t\"id\":\"351394464\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"魅族Pro6s全网通版 4+64GB 香槟金 双卡双待\",\n" +
            "\t\t\t\t\"sppic\":\"http://gfs2.gomein.net.cn/T1P5JTBXb_1RCvBVdK_160.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.gome.com.cn/9134560673-1123501463.html\",\n" +
            "\t\t\t\t\"spprice\":\"2699.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"国美在线\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"0\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"<font color=\\\"red\\\">魅族<\\/font>Pro6s全网通版 4+64GB 香槟金 双卡双待\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"8\",\n" +
            "\t\t\t\t\"id\":\"622439195\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"魅族 PRO6 32GB 银白 移动联通电信4G手机 全网通版 双卡双待\",\n" +
            "\t\t\t\t\"sppic\":\"http://gfs4.gomein.net.cn/T1lCKTBXdv1RCvBVdK_160.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.gome.com.cn/9134290551-1123230782.html\",\n" +
            "\t\t\t\t\"spprice\":\"2099.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"国美在线\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"1005\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"<font color=\\\"red\\\">魅族<\\/font> PRO6 32GB 银白 移动联通电信4G手机 全网通版 双卡双待\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"8\",\n" +
            "\t\t\t\t\"id\":\"372688387\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"魅族 PRO6 32GB 黑色 移动联通电信4G手机\",\n" +
            "\t\t\t\t\"sppic\":\"http://gfs2.gomein.net.cn/T1q._TBjAT1RCvBVdK_160.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.gome.com.cn/9134290551-1123231375.html\",\n" +
            "\t\t\t\t\"spprice\":\"2299.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"国美在线\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"1005\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"<font color=\\\"red\\\">魅族<\\/font> PRO6 32GB 黑色 移动联通电信4G手机\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"8\",\n" +
            "\t\t\t\t\"id\":\"394295165\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"魅族 PRO6S 64GB 全网通公开版 香槟金 移动联通电信4G手机 双卡双待\",\n" +
            "\t\t\t\t\"sppic\":\"http://img12.360buyimg.com/n8/jfs/t3709/246/1143355613/229733/35fe35a7/581f2e8cNafc11298.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.jd.com/3458059.html\",\n" +
            "\t\t\t\t\"spprice\":\"2699.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"京东商城\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"1733\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"<font color=\\\"red\\\">魅族<\\/font> PRO6S 64GB 全网通公开版 香槟金 移动联通电信4G手机 双卡双待\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"1\",\n" +
            "\t\t\t\t\"id\":\"610496102\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"魅族 PRO6 32GB 玫瑰金 全网通4G手机\",\n" +
            "\t\t\t\t\"sppic\":\"http://d7.yihaodianimg.com/N05/M0A/0C/BD/CgQI0ldjSfmAJ0CJAAPbLmQVQIE14601_230*230.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.yhd.com/item/61228250\",\n" +
            "\t\t\t\t\"spprice\":\"2299.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"1号店\",\n" +
            "\t\t\t\t\"commentUrl\":\"http://item.yhd.com/item/61228250\",\n" +
            "\t\t\t\t\"commentCount\":\"541\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"<font color=\\\"red\\\">魅族<\\/font> PRO6 32GB 玫瑰金 全网通4G手机\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"13\",\n" +
            "\t\t\t\t\"id\":\"430735317\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"魅族 PRO6 32GB 星空黑 全网通4G手机\",\n" +
            "\t\t\t\t\"sppic\":\"http://d6.yihaodianimg.com/N05/M03/EC/C9/CgQI01dPl6aAGwJzAATi4VlocbU31701_230*230.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.yhd.com/item/61228256\",\n" +
            "\t\t\t\t\"spprice\":\"2299.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"1号店\",\n" +
            "\t\t\t\t\"commentUrl\":\"http://item.yhd.com/item/61228256\",\n" +
            "\t\t\t\t\"commentCount\":\"541\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"<font color=\\\"red\\\">魅族<\\/font> PRO6 32GB 星空黑 全网通4G手机\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"13\",\n" +
            "\t\t\t\t\"id\":\"389628217\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"魅族 PRO6 32GB 玫瑰金 全网通4G手机\",\n" +
            "\t\t\t\t\"sppic\":\"http://d7.yihaodianimg.com/N05/M0A/0C/BD/CgQI0ldjSfmAJ0CJAAPbLmQVQIE14601_230*230.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.yhd.com/item/61320232\",\n" +
            "\t\t\t\t\"spprice\":\"2299.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"1号店\",\n" +
            "\t\t\t\t\"commentUrl\":\"http://item.yhd.com/item/61320232\",\n" +
            "\t\t\t\t\"commentCount\":\"541\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"<font color=\\\"red\\\">魅族<\\/font> PRO6 32GB 玫瑰金 全网通4G手机\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"13\",\n" +
            "\t\t\t\t\"id\":\"502530375\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"【苏宁直发 12期免息】Meizu/魅族Pro6 全网通4G手机  移动4G+/联通4G+/电信4G+                                 香槟金                         官方标配 32GB\",\n" +
            "\t\t\t\t\"sppic\":\"https://img.alicdn.com/imgextra/i3/2616970884/TB2gAyFnXXXXXb8XXXXXXXXXXXX_!!2616970884.jpg_430x430q90.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.tmall.com/item.htm?id=530188945404&skuId=3157112211467\",\n" +
            "\t\t\t\t\"spprice\":\"2299.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"天猫旗舰店(苏宁易购官方旗舰店)\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"3648\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"【苏宁直发 12期免息】Meizu/<font color=\\\"red\\\">魅族<\\/font>Pro6 全网通4G手机  移动4G+/联通4G+/电信4G+                                 香槟金                         官方标配 32G\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"278\",\n" +
            "\t\t\t\t\"id\":\"486234716\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"spname\":\"魅族 PRO6 32GB 月光银 全网通4G手机\",\n" +
            "\t\t\t\t\"sppic\":\"http://d8.yihaodianimg.com/N09/M04/C0/69/ChEi11dPmcWARE1AAARJmkIe1KI30601_230*230.jpg\",\n" +
            "\t\t\t\t\"spurl\":\"http://item.yhd.com/item/61228238\",\n" +
            "\t\t\t\t\"spprice\":\"2299.00\",\n" +
            "\t\t\t\t\"className\":\"手机\",\n" +
            "\t\t\t\t\"brandName\":\"魅族\",\n" +
            "\t\t\t\t\"siteName\":\"1号店\",\n" +
            "\t\t\t\t\"commentUrl\":\"\",\n" +
            "\t\t\t\t\"commentCount\":\"541\",\n" +
            "\t\t\t\t\"TitleHighLighter\":\"<font color=\\\"red\\\">魅族<\\/font> PRO6 32GB 月光银 全网通4G手机\",\n" +
            "\t\t\t\t\"ziying\":\"1\",\n" +
            "\t\t\t\t\"siteid\":\"13\",\n" +
            "\t\t\t\t\"id\":\"383011206\"\n" +
            "\t\t\t}\n" +
            "\t\t]\n" +
            "\t}\n" +
            "}";
}
