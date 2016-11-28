package com.halewang.shopping;

import com.google.gson.Gson;
import com.halewang.shopping.model.bean.compare.ProductBean;

/**
 * Created by halewang on 2016/11/28.
 */

public class Debug {
    public static final boolean IS_DEBUG = true;

    public static ProductBean getLocalData(){
        Gson gson = new Gson();
        ProductBean productBean = gson.fromJson(mLocalData, ProductBean.class);
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
}
