package com.example.androidrxjav2test;

import androidx.annotation.NonNull;

import com.google.gson.Gson;

import java.util.List;

public class User {


    /**
     * test_status : 0
     * code : 200
     * list : [{"subject_id":6,"product_type":"ZHIYEYISHI","create_time":1591004540000,"full_mark":10,"details":[{"subject_id":6,"id":1,"content":"（1）被检查者安静休息至少5分钟，采取坐位或仰卧位，裸露右上臂，伸直并外展45°，肘部置于与右心房同一水平（坐位平第4肋软骨，仰卧位平腋中线）。（2分）"},{"subject_id":6,"id":2,"content":"（2）让受检者脱下该侧衣袖，露出手臂，将袖带平展地缚于上臂，袖带下缘距肘窝横纹2~3cm，松紧适宜。（1分）"},{"subject_id":6,"id":3,"content":"（3）检查者先于肘窝处触知肱动脉搏动，一手将听诊器体件置于肱动脉上，轻压听诊器体件。另一手执橡皮球，旋紧气囊旋钮向袖带内边充气边听诊。待动脉音消失，再将汞柱升高20~30mmHg，开始缓慢（2~6mmHg/s）放气，听到第一个声音时所示的压力值是收缩压；继续放气，声音消失时血压计上所示的压力值是舒张压（个别声音不消失者，可采用变音值作为舒张压并加以注明）。（3分）"},{"subject_id":6,"id":4,"content":"（4）测压时双眼平视汞柱表面，根据听诊结果读出血压值。间隔1~2分钟重复测量，取两次读数的平均值。（2分）"},{"subject_id":6,"id":5,"content":"（5）血压测量完毕后将袖带解下、排气，平整的放入血压计盒内，将血压计汞柱向右侧倾斜45度，使管中水银完全进入水银槽后，关闭汞柱开关和血压计。（2分）"}],"id":6,"demo_id":"85AF156032B271949C33DC5901307461","type":"1","stem":"血压测量"},{"subject_id":7,"product_type":"ZHIYEYISHI","create_time":1591004543000,"full_mark":10,"details":[{"subject_id":7,"id":11,"content":"一、穿手术衣过程（10分）\r\n1.拿起叠放着的手术衣，不能污染其下面的手术衣。（1分）\r\n2.双手分别提起手术衣的衣领两端，抖开手术衣，有腰带的一面朝外。（2分）\r\n3.将手术衣略向上抛起，双手顺势插入衣袖内，助手在身后协助穿手术衣，使双手伸出袖口。（2分）\r\n4.身体略向前倾，使腰带悬垂离开手术衣（1分），双手交叉提起左右腰带向后递，由助手在身后接住并打结（2分）。\r\n5.穿手术衣过程中，手及前臂不能高过双肩，不能低于腰部。（2分） "},{"subject_id":7,"id":12,"content":"二、脱手术衣过程（2分）\r\n1.嘱助手在背后解开腰带及领结。（1分）\r\n2.嘱助手面对考生，拉住考生手术衣衣领，从肩部向肘部翻转，再向手的方向拉脱下，使衣袖外翻，手套的腕部内侧面随手术衣袖翻转于手上。（1分） "}],"id":7,"demo_id":"85AF156032B271949C33DC5901307461","type":"1","stem":"眼部检查"},{"subject_id":8,"product_type":"ZHIYEYISHI","create_time":1591004546000,"full_mark":10,"details":[{"subject_id":8,"id":6,"content":"（1）开包正确（1分）\r\n防止包内侧清洁面的污染。"},{"subject_id":8,"id":7,"content":"（2）取手套正确（2分）\r\n从手套包内取出手套，捏住手套反折处。"},{"subject_id":8,"id":8,"content":"（3）第一只手套戴法正确（2分）\r\n右手对准手套五指插入戴好，并将右手四个手指插入另手套反折处。"},{"subject_id":8,"id":9,"content":"（4）第二只手套戴法正确（2分）\r\n左手顺势戴好手套，两手分别把反折部翻至手术衣袖口上。"},{"subject_id":8,"id":10,"content":"（5）戴好手套后双手位置姿势正确（1分）\r\n双手、前臂置手胸前向上，不能接触胸腹部，防止污染。"}],"id":8,"demo_id":"85AF156032B271949C33DC5901307461","type":"1","stem":"戴无菌手套"}]
     */

    public int test_status;
    public String code;
    public List<ListBean> list;

    public static class ListBean {
        /**
         * subject_id : 6
         * product_type : ZHIYEYISHI
         * create_time : 1591004540000
         * full_mark : 10
         * details : [{"subject_id":6,"id":1,"content":"（1）被检查者安静休息至少5分钟，采取坐位或仰卧位，裸露右上臂，伸直并外展45°，肘部置于与右心房同一水平（坐位平第4肋软骨，仰卧位平腋中线）。（2分）"},{"subject_id":6,"id":2,"content":"（2）让受检者脱下该侧衣袖，露出手臂，将袖带平展地缚于上臂，袖带下缘距肘窝横纹2~3cm，松紧适宜。（1分）"},{"subject_id":6,"id":3,"content":"（3）检查者先于肘窝处触知肱动脉搏动，一手将听诊器体件置于肱动脉上，轻压听诊器体件。另一手执橡皮球，旋紧气囊旋钮向袖带内边充气边听诊。待动脉音消失，再将汞柱升高20~30mmHg，开始缓慢（2~6mmHg/s）放气，听到第一个声音时所示的压力值是收缩压；继续放气，声音消失时血压计上所示的压力值是舒张压（个别声音不消失者，可采用变音值作为舒张压并加以注明）。（3分）"},{"subject_id":6,"id":4,"content":"（4）测压时双眼平视汞柱表面，根据听诊结果读出血压值。间隔1~2分钟重复测量，取两次读数的平均值。（2分）"},{"subject_id":6,"id":5,"content":"（5）血压测量完毕后将袖带解下、排气，平整的放入血压计盒内，将血压计汞柱向右侧倾斜45度，使管中水银完全进入水银槽后，关闭汞柱开关和血压计。（2分）"}]
         * id : 6
         * demo_id : 85AF156032B271949C33DC5901307461
         * type : 1
         * stem : 血压测量
         */

        public int subject_id;
        public String product_type;
        public long create_time;
        public int full_mark;
        public int id;
        public String demo_id;
        public String type;
        public String stem;
        public List<DetailsBean> details;

        public static class DetailsBean {
            /**
             * subject_id : 6
             * id : 1
             * content : （1）被检查者安静休息至少5分钟，采取坐位或仰卧位，裸露右上臂，伸直并外展45°，肘部置于与右心房同一水平（坐位平第4肋软骨，仰卧位平腋中线）。（2分）
             */

            public int subject_id;
            public int id;
            public String content;
        }
    }

    @NonNull
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
