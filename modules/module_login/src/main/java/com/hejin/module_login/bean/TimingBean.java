package com.hejin.module_login.bean;

import java.util.List;

/**
 * 作者 : 贺金龙
 * 创建时间 :  2017/10/26 12:49
 * 类描述 :
 * 修改人 :
 * 修改内容 :
 * 修改时间 :
 * 类说明 :
 *  
 */
public class TimingBean {

    /**
     * reason : 查询成功
     * result : {"title":"NBA2014-2015赛季_常规赛赛程赛果","statuslist":{"st0":"未开赛","st1":"直播中","st2":"已结束"},"list":[{"title":"12-07 周日","tr":[{"link1text":"视频集锦","link1url":"http://video.sina.com.cn/p/sports/k/v/2014-12-07/140064340433.html","link2text":"技术统计","link2url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120608","player1":"76人","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/20.png","player1logobig":"http://p4.qhimg.com/t01d3db357326a5f9b7.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=20","player2":"活塞","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/8.png","player2logobig":"http://p4.qhimg.com/t014bc2a39f1ff5a13a.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=8","score":"108-101","status":2,"time":"12/07 08:30"},{"link1text":"视频集锦","link1url":"http://video.sina.com.cn/p/sports/k/v/2014-12-07/122964340177.html","link2text":"技术统计","link2url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120604","player1":"勇士","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/9.png","player1logobig":"http://p7.qhimg.com/t01d2065c2ad5a47937.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=9","player2":"公牛","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/4.png","player2logobig":"http://p6.qhimg.com/t01be4b73bdda7dbb0b.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=4","score":"112-102","status":2,"time":"12/07 09:00"},{"link1text":"视频集锦","link1url":"http://video.sina.com.cn/z/sports/k/nba/141207phxhou/","link2text":"技术统计","link2url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120610","player1":"太阳","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/21.png","player1logobig":"http://p5.qhimg.com/t010dda40063e994c77.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=21","player2":"火箭","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/10.png","player2logobig":"http://p5.qhimg.com/t015ca41a7ba9c358b6.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=10","score":"95-100","status":2,"time":"12/07 09:00"},{"link1text":"视频集锦","link1url":"http://video.sina.com.cn/p/sports/k/v/2014-12-07/134864340393.html","link2text":"技术统计","link2url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120624","player1":"森林狼","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/16.png","player1logobig":"http://p2.qhimg.com/t01a05379822b554e07.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=16","player2":"马刺","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/24.png","player2logobig":"http://p8.qhimg.com/t019450aafe5d71656d.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=24","score":"101-123","status":2,"time":"12/07 09:30"},{"link1text":"视频集锦","link1url":"http://video.sina.com.cn/p/sports/k/v/2014-12-07/144764340623.html","link2text":"技术统计","link2url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120623","player1":"魔术","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/19.png","player1logobig":"http://p5.qhimg.com/t0167317f2b1249e741.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=19","player2":"国王","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/23.png","player2logobig":"http://p7.qhimg.com/t018d78076cc925f692.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=23","score":"105-96","status":2,"time":"12/07 11:00"},{"link1text":"视频集锦","link1url":"http://video.sina.com.cn/z/sports/k/nba/141207noplac/","link2text":"技术统计","link2url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120612","player1":"鹈鹕","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/3.png","player1logobig":"http://p5.qhimg.com/t01d4114e4e03806e71.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=3","player2":"快船","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/12.png","player2logobig":"http://p6.qhimg.com/t0198ca8635a51d759d.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=12","score":"100-120","status":2,"time":"12/07 11:30"}],"bottomlink":[{"text":"常规赛赛程","url":"http://nba.sports.sina.com.cn/match_result.php"},{"text":"电视转播表","url":"http://nba.sports.sina.com.cn/showtv.php?"},{"text":"球队排名","url":"http://nba.sports.sina.com.cn/league_order.php?"},{"text":"球员排名","url":"http://nba.sports.sina.com.cn/playerstats.php?"}]},{"title":"12-08 今日","live":[{"date":"2014-12-08","liveurl":"http://video.sina.com.cn/l/pl/sportstv/1691558.html","player1":"鹈鹕","player1info":"胜8负10-西部11名","player1location":"(客)","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/3.png","player1logobig":"http://p5.qhimg.com/t01d4114e4e03806e71.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=3","player2":"湖人","player2info":"胜5负15-西部14名","player2location":"(主)","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/13.png","player2logobig":"http://p3.qhimg.com/t01f3bf12583c6c0c67.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=13","score":"VS","status":0,"title":"今日热门  10:30开赛"}],"livelink":[{"text":"视频直播","url":"http://video.sina.com.cn/l/pl/sportstv/1691558.html","videoicon":"1"},{"text":"文字直播","url":"http://sports.sina.com.cn/nba/live.html?id=2014120713"},{"text":"交战历史","url":"http://match.sports.sina.com.cn/index.html#type=compare"},{"text":"技术统计","url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120713"}],"tr":[{"link1text":"文字直播","link1url":"http://sports.sina.com.cn/nba/live.html?id=2014120706","link2text":"技术统计","link2url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120706","player1":"雄鹿","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/15.png","player1logobig":"http://p0.qhimg.com/t01516f7685ada2de4b.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=15","player2":"小牛","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/6.png","player2logobig":"http://p2.qhimg.com/t01e2e3119877390c57.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=6","score":"46-59","status":1,"time":"12/08 08:30"},{"link1text":"文字直播","link1url":"http://sports.sina.com.cn/nba/live.html?id=2014120718","link2text":"技术统计","link2url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120718","player1":"开拓者","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/22.png","player1logobig":"http://p2.qhimg.com/t019d57825e72f97659.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=22","player2":"尼克斯","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/18.png","player2logobig":"http://p8.qhimg.com/t01c1b964d5b59a9a78.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=18","score":"53-50","status":1,"time":"12/08 08:30"},{"link1text":"视频集锦","link1url":"http://video.sina.com.cn/p/sports/k/v/2014-12-08/085464343137.html","link2text":"技术统计","link2url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120702","player1":"奇才","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/27.png","player1logobig":"http://p4.qhimg.com/t01eee508ed62bff361.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=27","player2":"凯尔特人","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/2.png","player2logobig":"http://p8.qhimg.com/t018286fc21467c2a06.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=2","score":"93-101","status":2,"time":"12/08 02:00"},{"link1text":"视频集锦","link1url":"http://video.sina.com.cn/p/sports/k/v/2014-12-08/093664343241.html","link2text":"技术统计","link2url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120701","player1":"掘金","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/7.png","player1logobig":"http://p3.qhimg.com/t01496ad82fd55c5e3e.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=7","player2":"老鹰","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/1.png","player2logobig":"http://p7.qhimg.com/t01b62fc6cc93d24575.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=1","score":"84-96","status":2,"time":"12/08 04:30"},{"link1text":"直播实录","link1url":"http://sports.sina.com.cn/nba/live.html?id=2014120729","link2text":"技术统计","link2url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120729","player1":"热火","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/14.png","player1logobig":"http://p7.qhimg.com/t0157f207551f094017.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=14","player2":"灰熊","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/29.png","player2logobig":"http://p7.qhimg.com/t01443a5528019e9f64.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=29","score":"87-103","status":2,"time":"12/08 07:00"},{"link1text":"直播实录","link1url":"http://sports.sina.com.cn/nba/live.html?id=2014120708","link2text":"技术统计","link2url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120708","player1":"雷霆","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/25.png","player1logobig":"http://p7.qhimg.com/t01ebd550dabdf9e9e2.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=25","player2":"活塞","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/8.png","player2logobig":"http://p4.qhimg.com/t014bc2a39f1ff5a13a.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=8","score":"96-94","status":2,"time":"12/08 07:00"},{"link1text":"视频直播","link1url":"http://video.sina.com.cn/l/pl/sportstv/1691558.html","link2text":"交战历史","link2url":"http://match.sports.sina.com.cn/index.html#type=compare","player1":"鹈鹕","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/3.png","player1logobig":"http://p5.qhimg.com/t01d4114e4e03806e71.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=3","player2":"湖人","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/13.png","player2logobig":"http://p3.qhimg.com/t01f3bf12583c6c0c67.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=13","score":"VS","status":0,"time":"12/08 10:30","videoicon":"1"}],"bottomlink":[{"text":"常规赛赛程","url":"http://nba.sports.sina.com.cn/match_result.php"},{"text":"电视转播表","url":"http://nba.sports.sina.com.cn/showtv.php?"},{"text":"球队排名","url":"http://nba.sports.sina.com.cn/league_order.php?"},{"text":"球员排名","url":"http://nba.sports.sina.com.cn/playerstats.php?"}]},{"title":"12-09 周二","tr":[{"link1text":"文字直播","link1url":"http://sports.sina.com.cn/nba/live.html?id=2014120811","link2text":"交战历史","link2url":"http://match.sports.sina.com.cn/index.html#type=compare","player1":"老鹰","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/1.png","player1logobig":"http://p7.qhimg.com/t01b62fc6cc93d24575.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=1","player2":"步行者","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/11.png","player2logobig":"http://p2.qhimg.com/t0159f5d9acc67d38ee.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=11","score":"VS","status":0,"time":"12/09 08:00"},{"link1text":"文字直播","link1url":"http://sports.sina.com.cn/nba/live.html?id=2014120827","link2text":"交战历史","link2url":"http://match.sports.sina.com.cn/index.html#type=compare","player1":"凯尔特人","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/2.png","player1logobig":"http://p8.qhimg.com/t018286fc21467c2a06.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=2","player2":"奇才","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/27.png","player2logobig":"http://p4.qhimg.com/t01eee508ed62bff361.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=27","score":"VS","status":0,"time":"12/09 08:00"},{"link1text":"视频直播","link1url":"http://video.sina.com.cn/l/pl/sportstv/1691559.html","link2text":"交战历史","link2url":"http://match.sports.sina.com.cn/index.html#type=compare","player1":"骑士","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/5.png","player1logobig":"http://p5.qhimg.com/t014d6afcbfc0523b25.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=5","player2":"篮网","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/17.png","player2logobig":"http://p6.qhimg.com/t01effe2e3564d04214.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=17","score":"VS","status":0,"time":"12/09 08:30","videoicon":"1"},{"link1text":"文字直播","link1url":"http://sports.sina.com.cn/nba/live.html?id=2014120828","link2text":"交战历史","link2url":"http://match.sports.sina.com.cn/index.html#type=compare","player1":"掘金","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/7.png","player1logobig":"http://p3.qhimg.com/t01496ad82fd55c5e3e.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=7","player2":"猛龙","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/28.png","player2logobig":"http://p5.qhimg.com/t0117c8a58019b79351.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=28","score":"VS","status":0,"time":"12/09 08:30"},{"link1text":"文字直播","link1url":"http://sports.sina.com.cn/nba/live.html?id=2014120816","link2text":"交战历史","link2url":"http://match.sports.sina.com.cn/index.html#type=compare","player1":"勇士","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/9.png","player1logobig":"http://p7.qhimg.com/t01d2065c2ad5a47937.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=9","player2":"森林狼","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/16.png","player2logobig":"http://p2.qhimg.com/t01a05379822b554e07.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=16","score":"VS","status":0,"time":"12/09 09:00"},{"link1text":"文字直播","link1url":"http://sports.sina.com.cn/nba/live.html?id=2014120823","link2text":"交战历史","link2url":"http://match.sports.sina.com.cn/index.html#type=compare","player1":"爵士","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/26.png","player1logobig":"http://p3.qhimg.com/t01b5ae4c46d99097f5.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=26","player2":"国王","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/23.png","player2logobig":"http://p7.qhimg.com/t018d78076cc925f692.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=23","score":"VS","status":0,"time":"12/09 11:00"},{"link1text":"文字直播","link1url":"http://sports.sina.com.cn/nba/live.html?id=2014120812","link2text":"交战历史","link2url":"http://match.sports.sina.com.cn/index.html#type=compare","player1":"太阳","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/21.png","player1logobig":"http://p5.qhimg.com/t010dda40063e994c77.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=21","player2":"快船","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/12.png","player2logobig":"http://p6.qhimg.com/t0198ca8635a51d759d.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=12","score":"VS","status":0,"time":"12/09 11:30"}],"bottomlink":[{"text":"常规赛赛程","url":"http://nba.sports.sina.com.cn/match_result.php"},{"text":"电视转播表","url":"http://nba.sports.sina.com.cn/showtv.php?"},{"text":"球队排名","url":"http://nba.sports.sina.com.cn/league_order.php?"},{"text":"球员排名","url":"http://nba.sports.sina.com.cn/playerstats.php?"}]}],"teammatch":[{"name":"老鹰","url":"http://nba.sports.sina.com.cn/team_match.php?id=1"},{"name":"凯尔特人","url":"http://nba.sports.sina.com.cn/team_match.php?id=2"},{"name":"山猫","url":"http://nba.sports.sina.com.cn/team_match.php?id=30"},{"name":"公牛","url":"http://nba.sports.sina.com.cn/team_match.php?id=4"},{"name":"骑士","url":"http://nba.sports.sina.com.cn/team_match.php?id=5"},{"name":"小牛","url":"http://nba.sports.sina.com.cn/team_match.php?id=6"},{"name":"掘金","url":"http://nba.sports.sina.com.cn/team_match.php?id=7"},{"name":"活塞","url":"http://nba.sports.sina.com.cn/team_match.php?id=8"},{"name":"勇士","url":"http://nba.sports.sina.com.cn/team_match.php?id=9"},{"name":"火箭","url":"http://nba.sports.sina.com.cn/team_match.php?id=10"},{"name":"步行者","url":"http://nba.sports.sina.com.cn/team_match.php?id=11"},{"name":"快船","url":"http://nba.sports.sina.com.cn/team_match.php?id=12"},{"name":"湖人","url":"http://nba.sports.sina.com.cn/team_match.php?id=13"},{"name":"灰熊","url":"http://nba.sports.sina.com.cn/team_match.php?id=29"},{"name":"热火","url":"http://nba.sports.sina.com.cn/team_match.php?id=14"},{"name":"雄鹿","url":"http://nba.sports.sina.com.cn/team_match.php?id=15"},{"name":"森林狼","url":"http://nba.sports.sina.com.cn/team_match.php?id=16"},{"name":"篮网","url":"http://nba.sports.sina.com.cn/team_match.php?id=17"},{"name":"鹈鹕","url":"http://nba.sports.sina.com.cn/team_match.php?id=3"},{"name":"尼克斯","url":"http://nba.sports.sina.com.cn/team_match.php?id=18"},{"name":"魔术","url":"http://nba.sports.sina.com.cn/team_match.php?id=19"},{"name":"76人","url":"http://nba.sports.sina.com.cn/team_match.php?id=20"},{"name":"太阳","url":"http://nba.sports.sina.com.cn/team_match.php?id=21"},{"name":"开拓者","url":"http://nba.sports.sina.com.cn/team_match.php?id=22"},{"name":"国王","url":"http://nba.sports.sina.com.cn/team_match.php?id=23"},{"name":"马刺","url":"http://nba.sports.sina.com.cn/team_match.php?id=24"},{"name":"雷霆","url":"http://nba.sports.sina.com.cn/team_match.php?id=25"},{"name":"猛龙","url":"http://nba.sports.sina.com.cn/team_match.php?id=28"},{"name":"爵士","url":"http://nba.sports.sina.com.cn/team_match.php?id=26"},{"name":"奇才","url":"http://nba.sports.sina.com.cn/team_match.php?id=27"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * title : NBA2014-2015赛季_常规赛赛程赛果
         * statuslist : {"st0":"未开赛","st1":"直播中","st2":"已结束"}
         * list : [{"title":"12-07 周日","tr":[{"link1text":"视频集锦","link1url":"http://video.sina.com.cn/p/sports/k/v/2014-12-07/140064340433.html","link2text":"技术统计","link2url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120608","player1":"76人","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/20.png","player1logobig":"http://p4.qhimg.com/t01d3db357326a5f9b7.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=20","player2":"活塞","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/8.png","player2logobig":"http://p4.qhimg.com/t014bc2a39f1ff5a13a.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=8","score":"108-101","status":2,"time":"12/07 08:30"},{"link1text":"视频集锦","link1url":"http://video.sina.com.cn/p/sports/k/v/2014-12-07/122964340177.html","link2text":"技术统计","link2url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120604","player1":"勇士","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/9.png","player1logobig":"http://p7.qhimg.com/t01d2065c2ad5a47937.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=9","player2":"公牛","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/4.png","player2logobig":"http://p6.qhimg.com/t01be4b73bdda7dbb0b.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=4","score":"112-102","status":2,"time":"12/07 09:00"},{"link1text":"视频集锦","link1url":"http://video.sina.com.cn/z/sports/k/nba/141207phxhou/","link2text":"技术统计","link2url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120610","player1":"太阳","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/21.png","player1logobig":"http://p5.qhimg.com/t010dda40063e994c77.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=21","player2":"火箭","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/10.png","player2logobig":"http://p5.qhimg.com/t015ca41a7ba9c358b6.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=10","score":"95-100","status":2,"time":"12/07 09:00"},{"link1text":"视频集锦","link1url":"http://video.sina.com.cn/p/sports/k/v/2014-12-07/134864340393.html","link2text":"技术统计","link2url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120624","player1":"森林狼","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/16.png","player1logobig":"http://p2.qhimg.com/t01a05379822b554e07.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=16","player2":"马刺","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/24.png","player2logobig":"http://p8.qhimg.com/t019450aafe5d71656d.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=24","score":"101-123","status":2,"time":"12/07 09:30"},{"link1text":"视频集锦","link1url":"http://video.sina.com.cn/p/sports/k/v/2014-12-07/144764340623.html","link2text":"技术统计","link2url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120623","player1":"魔术","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/19.png","player1logobig":"http://p5.qhimg.com/t0167317f2b1249e741.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=19","player2":"国王","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/23.png","player2logobig":"http://p7.qhimg.com/t018d78076cc925f692.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=23","score":"105-96","status":2,"time":"12/07 11:00"},{"link1text":"视频集锦","link1url":"http://video.sina.com.cn/z/sports/k/nba/141207noplac/","link2text":"技术统计","link2url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120612","player1":"鹈鹕","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/3.png","player1logobig":"http://p5.qhimg.com/t01d4114e4e03806e71.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=3","player2":"快船","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/12.png","player2logobig":"http://p6.qhimg.com/t0198ca8635a51d759d.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=12","score":"100-120","status":2,"time":"12/07 11:30"}],"bottomlink":[{"text":"常规赛赛程","url":"http://nba.sports.sina.com.cn/match_result.php"},{"text":"电视转播表","url":"http://nba.sports.sina.com.cn/showtv.php?"},{"text":"球队排名","url":"http://nba.sports.sina.com.cn/league_order.php?"},{"text":"球员排名","url":"http://nba.sports.sina.com.cn/playerstats.php?"}]},{"title":"12-08 今日","live":[{"date":"2014-12-08","liveurl":"http://video.sina.com.cn/l/pl/sportstv/1691558.html","player1":"鹈鹕","player1info":"胜8负10-西部11名","player1location":"(客)","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/3.png","player1logobig":"http://p5.qhimg.com/t01d4114e4e03806e71.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=3","player2":"湖人","player2info":"胜5负15-西部14名","player2location":"(主)","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/13.png","player2logobig":"http://p3.qhimg.com/t01f3bf12583c6c0c67.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=13","score":"VS","status":0,"title":"今日热门  10:30开赛"}],"livelink":[{"text":"视频直播","url":"http://video.sina.com.cn/l/pl/sportstv/1691558.html","videoicon":"1"},{"text":"文字直播","url":"http://sports.sina.com.cn/nba/live.html?id=2014120713"},{"text":"交战历史","url":"http://match.sports.sina.com.cn/index.html#type=compare"},{"text":"技术统计","url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120713"}],"tr":[{"link1text":"文字直播","link1url":"http://sports.sina.com.cn/nba/live.html?id=2014120706","link2text":"技术统计","link2url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120706","player1":"雄鹿","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/15.png","player1logobig":"http://p0.qhimg.com/t01516f7685ada2de4b.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=15","player2":"小牛","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/6.png","player2logobig":"http://p2.qhimg.com/t01e2e3119877390c57.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=6","score":"46-59","status":1,"time":"12/08 08:30"},{"link1text":"文字直播","link1url":"http://sports.sina.com.cn/nba/live.html?id=2014120718","link2text":"技术统计","link2url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120718","player1":"开拓者","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/22.png","player1logobig":"http://p2.qhimg.com/t019d57825e72f97659.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=22","player2":"尼克斯","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/18.png","player2logobig":"http://p8.qhimg.com/t01c1b964d5b59a9a78.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=18","score":"53-50","status":1,"time":"12/08 08:30"},{"link1text":"视频集锦","link1url":"http://video.sina.com.cn/p/sports/k/v/2014-12-08/085464343137.html","link2text":"技术统计","link2url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120702","player1":"奇才","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/27.png","player1logobig":"http://p4.qhimg.com/t01eee508ed62bff361.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=27","player2":"凯尔特人","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/2.png","player2logobig":"http://p8.qhimg.com/t018286fc21467c2a06.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=2","score":"93-101","status":2,"time":"12/08 02:00"},{"link1text":"视频集锦","link1url":"http://video.sina.com.cn/p/sports/k/v/2014-12-08/093664343241.html","link2text":"技术统计","link2url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120701","player1":"掘金","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/7.png","player1logobig":"http://p3.qhimg.com/t01496ad82fd55c5e3e.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=7","player2":"老鹰","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/1.png","player2logobig":"http://p7.qhimg.com/t01b62fc6cc93d24575.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=1","score":"84-96","status":2,"time":"12/08 04:30"},{"link1text":"直播实录","link1url":"http://sports.sina.com.cn/nba/live.html?id=2014120729","link2text":"技术统计","link2url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120729","player1":"热火","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/14.png","player1logobig":"http://p7.qhimg.com/t0157f207551f094017.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=14","player2":"灰熊","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/29.png","player2logobig":"http://p7.qhimg.com/t01443a5528019e9f64.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=29","score":"87-103","status":2,"time":"12/08 07:00"},{"link1text":"直播实录","link1url":"http://sports.sina.com.cn/nba/live.html?id=2014120708","link2text":"技术统计","link2url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120708","player1":"雷霆","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/25.png","player1logobig":"http://p7.qhimg.com/t01ebd550dabdf9e9e2.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=25","player2":"活塞","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/8.png","player2logobig":"http://p4.qhimg.com/t014bc2a39f1ff5a13a.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=8","score":"96-94","status":2,"time":"12/08 07:00"},{"link1text":"视频直播","link1url":"http://video.sina.com.cn/l/pl/sportstv/1691558.html","link2text":"交战历史","link2url":"http://match.sports.sina.com.cn/index.html#type=compare","player1":"鹈鹕","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/3.png","player1logobig":"http://p5.qhimg.com/t01d4114e4e03806e71.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=3","player2":"湖人","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/13.png","player2logobig":"http://p3.qhimg.com/t01f3bf12583c6c0c67.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=13","score":"VS","status":0,"time":"12/08 10:30","videoicon":"1"}],"bottomlink":[{"text":"常规赛赛程","url":"http://nba.sports.sina.com.cn/match_result.php"},{"text":"电视转播表","url":"http://nba.sports.sina.com.cn/showtv.php?"},{"text":"球队排名","url":"http://nba.sports.sina.com.cn/league_order.php?"},{"text":"球员排名","url":"http://nba.sports.sina.com.cn/playerstats.php?"}]},{"title":"12-09 周二","tr":[{"link1text":"文字直播","link1url":"http://sports.sina.com.cn/nba/live.html?id=2014120811","link2text":"交战历史","link2url":"http://match.sports.sina.com.cn/index.html#type=compare","player1":"老鹰","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/1.png","player1logobig":"http://p7.qhimg.com/t01b62fc6cc93d24575.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=1","player2":"步行者","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/11.png","player2logobig":"http://p2.qhimg.com/t0159f5d9acc67d38ee.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=11","score":"VS","status":0,"time":"12/09 08:00"},{"link1text":"文字直播","link1url":"http://sports.sina.com.cn/nba/live.html?id=2014120827","link2text":"交战历史","link2url":"http://match.sports.sina.com.cn/index.html#type=compare","player1":"凯尔特人","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/2.png","player1logobig":"http://p8.qhimg.com/t018286fc21467c2a06.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=2","player2":"奇才","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/27.png","player2logobig":"http://p4.qhimg.com/t01eee508ed62bff361.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=27","score":"VS","status":0,"time":"12/09 08:00"},{"link1text":"视频直播","link1url":"http://video.sina.com.cn/l/pl/sportstv/1691559.html","link2text":"交战历史","link2url":"http://match.sports.sina.com.cn/index.html#type=compare","player1":"骑士","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/5.png","player1logobig":"http://p5.qhimg.com/t014d6afcbfc0523b25.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=5","player2":"篮网","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/17.png","player2logobig":"http://p6.qhimg.com/t01effe2e3564d04214.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=17","score":"VS","status":0,"time":"12/09 08:30","videoicon":"1"},{"link1text":"文字直播","link1url":"http://sports.sina.com.cn/nba/live.html?id=2014120828","link2text":"交战历史","link2url":"http://match.sports.sina.com.cn/index.html#type=compare","player1":"掘金","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/7.png","player1logobig":"http://p3.qhimg.com/t01496ad82fd55c5e3e.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=7","player2":"猛龙","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/28.png","player2logobig":"http://p5.qhimg.com/t0117c8a58019b79351.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=28","score":"VS","status":0,"time":"12/09 08:30"},{"link1text":"文字直播","link1url":"http://sports.sina.com.cn/nba/live.html?id=2014120816","link2text":"交战历史","link2url":"http://match.sports.sina.com.cn/index.html#type=compare","player1":"勇士","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/9.png","player1logobig":"http://p7.qhimg.com/t01d2065c2ad5a47937.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=9","player2":"森林狼","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/16.png","player2logobig":"http://p2.qhimg.com/t01a05379822b554e07.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=16","score":"VS","status":0,"time":"12/09 09:00"},{"link1text":"文字直播","link1url":"http://sports.sina.com.cn/nba/live.html?id=2014120823","link2text":"交战历史","link2url":"http://match.sports.sina.com.cn/index.html#type=compare","player1":"爵士","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/26.png","player1logobig":"http://p3.qhimg.com/t01b5ae4c46d99097f5.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=26","player2":"国王","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/23.png","player2logobig":"http://p7.qhimg.com/t018d78076cc925f692.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=23","score":"VS","status":0,"time":"12/09 11:00"},{"link1text":"文字直播","link1url":"http://sports.sina.com.cn/nba/live.html?id=2014120812","link2text":"交战历史","link2url":"http://match.sports.sina.com.cn/index.html#type=compare","player1":"太阳","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/21.png","player1logobig":"http://p5.qhimg.com/t010dda40063e994c77.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=21","player2":"快船","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/12.png","player2logobig":"http://p6.qhimg.com/t0198ca8635a51d759d.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=12","score":"VS","status":0,"time":"12/09 11:30"}],"bottomlink":[{"text":"常规赛赛程","url":"http://nba.sports.sina.com.cn/match_result.php"},{"text":"电视转播表","url":"http://nba.sports.sina.com.cn/showtv.php?"},{"text":"球队排名","url":"http://nba.sports.sina.com.cn/league_order.php?"},{"text":"球员排名","url":"http://nba.sports.sina.com.cn/playerstats.php?"}]}]
         * teammatch : [{"name":"老鹰","url":"http://nba.sports.sina.com.cn/team_match.php?id=1"},{"name":"凯尔特人","url":"http://nba.sports.sina.com.cn/team_match.php?id=2"},{"name":"山猫","url":"http://nba.sports.sina.com.cn/team_match.php?id=30"},{"name":"公牛","url":"http://nba.sports.sina.com.cn/team_match.php?id=4"},{"name":"骑士","url":"http://nba.sports.sina.com.cn/team_match.php?id=5"},{"name":"小牛","url":"http://nba.sports.sina.com.cn/team_match.php?id=6"},{"name":"掘金","url":"http://nba.sports.sina.com.cn/team_match.php?id=7"},{"name":"活塞","url":"http://nba.sports.sina.com.cn/team_match.php?id=8"},{"name":"勇士","url":"http://nba.sports.sina.com.cn/team_match.php?id=9"},{"name":"火箭","url":"http://nba.sports.sina.com.cn/team_match.php?id=10"},{"name":"步行者","url":"http://nba.sports.sina.com.cn/team_match.php?id=11"},{"name":"快船","url":"http://nba.sports.sina.com.cn/team_match.php?id=12"},{"name":"湖人","url":"http://nba.sports.sina.com.cn/team_match.php?id=13"},{"name":"灰熊","url":"http://nba.sports.sina.com.cn/team_match.php?id=29"},{"name":"热火","url":"http://nba.sports.sina.com.cn/team_match.php?id=14"},{"name":"雄鹿","url":"http://nba.sports.sina.com.cn/team_match.php?id=15"},{"name":"森林狼","url":"http://nba.sports.sina.com.cn/team_match.php?id=16"},{"name":"篮网","url":"http://nba.sports.sina.com.cn/team_match.php?id=17"},{"name":"鹈鹕","url":"http://nba.sports.sina.com.cn/team_match.php?id=3"},{"name":"尼克斯","url":"http://nba.sports.sina.com.cn/team_match.php?id=18"},{"name":"魔术","url":"http://nba.sports.sina.com.cn/team_match.php?id=19"},{"name":"76人","url":"http://nba.sports.sina.com.cn/team_match.php?id=20"},{"name":"太阳","url":"http://nba.sports.sina.com.cn/team_match.php?id=21"},{"name":"开拓者","url":"http://nba.sports.sina.com.cn/team_match.php?id=22"},{"name":"国王","url":"http://nba.sports.sina.com.cn/team_match.php?id=23"},{"name":"马刺","url":"http://nba.sports.sina.com.cn/team_match.php?id=24"},{"name":"雷霆","url":"http://nba.sports.sina.com.cn/team_match.php?id=25"},{"name":"猛龙","url":"http://nba.sports.sina.com.cn/team_match.php?id=28"},{"name":"爵士","url":"http://nba.sports.sina.com.cn/team_match.php?id=26"},{"name":"奇才","url":"http://nba.sports.sina.com.cn/team_match.php?id=27"}]
         */

        private String title;
        private StatuslistBean statuslist;
        private List<ListBean> list;
        private List<TeammatchBean> teammatch;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public StatuslistBean getStatuslist() {
            return statuslist;
        }

        public void setStatuslist(StatuslistBean statuslist) {
            this.statuslist = statuslist;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public List<TeammatchBean> getTeammatch() {
            return teammatch;
        }

        public void setTeammatch(List<TeammatchBean> teammatch) {
            this.teammatch = teammatch;
        }

        public static class StatuslistBean {
            /**
             * st0 : 未开赛
             * st1 : 直播中
             * st2 : 已结束
             */

            private String st0;
            private String st1;
            private String st2;

            public String getSt0() {
                return st0;
            }

            public void setSt0(String st0) {
                this.st0 = st0;
            }

            public String getSt1() {
                return st1;
            }

            public void setSt1(String st1) {
                this.st1 = st1;
            }

            public String getSt2() {
                return st2;
            }

            public void setSt2(String st2) {
                this.st2 = st2;
            }
        }

        public static class ListBean {
            /**
             * title : 12-07 周日
             * tr : [{"link1text":"视频集锦","link1url":"http://video.sina.com.cn/p/sports/k/v/2014-12-07/140064340433.html","link2text":"技术统计","link2url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120608","player1":"76人","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/20.png","player1logobig":"http://p4.qhimg.com/t01d3db357326a5f9b7.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=20","player2":"活塞","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/8.png","player2logobig":"http://p4.qhimg.com/t014bc2a39f1ff5a13a.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=8","score":"108-101","status":2,"time":"12/07 08:30"},{"link1text":"视频集锦","link1url":"http://video.sina.com.cn/p/sports/k/v/2014-12-07/122964340177.html","link2text":"技术统计","link2url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120604","player1":"勇士","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/9.png","player1logobig":"http://p7.qhimg.com/t01d2065c2ad5a47937.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=9","player2":"公牛","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/4.png","player2logobig":"http://p6.qhimg.com/t01be4b73bdda7dbb0b.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=4","score":"112-102","status":2,"time":"12/07 09:00"},{"link1text":"视频集锦","link1url":"http://video.sina.com.cn/z/sports/k/nba/141207phxhou/","link2text":"技术统计","link2url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120610","player1":"太阳","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/21.png","player1logobig":"http://p5.qhimg.com/t010dda40063e994c77.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=21","player2":"火箭","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/10.png","player2logobig":"http://p5.qhimg.com/t015ca41a7ba9c358b6.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=10","score":"95-100","status":2,"time":"12/07 09:00"},{"link1text":"视频集锦","link1url":"http://video.sina.com.cn/p/sports/k/v/2014-12-07/134864340393.html","link2text":"技术统计","link2url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120624","player1":"森林狼","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/16.png","player1logobig":"http://p2.qhimg.com/t01a05379822b554e07.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=16","player2":"马刺","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/24.png","player2logobig":"http://p8.qhimg.com/t019450aafe5d71656d.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=24","score":"101-123","status":2,"time":"12/07 09:30"},{"link1text":"视频集锦","link1url":"http://video.sina.com.cn/p/sports/k/v/2014-12-07/144764340623.html","link2text":"技术统计","link2url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120623","player1":"魔术","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/19.png","player1logobig":"http://p5.qhimg.com/t0167317f2b1249e741.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=19","player2":"国王","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/23.png","player2logobig":"http://p7.qhimg.com/t018d78076cc925f692.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=23","score":"105-96","status":2,"time":"12/07 11:00"},{"link1text":"视频集锦","link1url":"http://video.sina.com.cn/z/sports/k/nba/141207noplac/","link2text":"技术统计","link2url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120612","player1":"鹈鹕","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/3.png","player1logobig":"http://p5.qhimg.com/t01d4114e4e03806e71.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=3","player2":"快船","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/12.png","player2logobig":"http://p6.qhimg.com/t0198ca8635a51d759d.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=12","score":"100-120","status":2,"time":"12/07 11:30"}]
             * bottomlink : [{"text":"常规赛赛程","url":"http://nba.sports.sina.com.cn/match_result.php"},{"text":"电视转播表","url":"http://nba.sports.sina.com.cn/showtv.php?"},{"text":"球队排名","url":"http://nba.sports.sina.com.cn/league_order.php?"},{"text":"球员排名","url":"http://nba.sports.sina.com.cn/playerstats.php?"}]
             * live : [{"date":"2014-12-08","liveurl":"http://video.sina.com.cn/l/pl/sportstv/1691558.html","player1":"鹈鹕","player1info":"胜8负10-西部11名","player1location":"(客)","player1logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/3.png","player1logobig":"http://p5.qhimg.com/t01d4114e4e03806e71.png","player1url":"http://nba.sports.sina.com.cn/team.php?id=3","player2":"湖人","player2info":"胜5负15-西部14名","player2location":"(主)","player2logo":"http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/13.png","player2logobig":"http://p3.qhimg.com/t01f3bf12583c6c0c67.png","player2url":"http://nba.sports.sina.com.cn/team.php?id=13","score":"VS","status":0,"title":"今日热门  10:30开赛"}]
             * livelink : [{"text":"视频直播","url":"http://video.sina.com.cn/l/pl/sportstv/1691558.html","videoicon":"1"},{"text":"文字直播","url":"http://sports.sina.com.cn/nba/live.html?id=2014120713"},{"text":"交战历史","url":"http://match.sports.sina.com.cn/index.html#type=compare"},{"text":"技术统计","url":"http://nba.sports.sina.com.cn/look_scores.php?id=2014120713"}]
             */

            private String title;
            private List<TrBean> tr;
            private List<BottomlinkBean> bottomlink;
            private List<LiveBean> live;
            private List<LivelinkBean> livelink;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public List<TrBean> getTr() {
                return tr;
            }

            public void setTr(List<TrBean> tr) {
                this.tr = tr;
            }

            public List<BottomlinkBean> getBottomlink() {
                return bottomlink;
            }

            public void setBottomlink(List<BottomlinkBean> bottomlink) {
                this.bottomlink = bottomlink;
            }

            public List<LiveBean> getLive() {
                return live;
            }

            public void setLive(List<LiveBean> live) {
                this.live = live;
            }

            public List<LivelinkBean> getLivelink() {
                return livelink;
            }

            public void setLivelink(List<LivelinkBean> livelink) {
                this.livelink = livelink;
            }

            public static class TrBean {
                /**
                 * link1text : 视频集锦
                 * link1url : http://video.sina.com.cn/p/sports/k/v/2014-12-07/140064340433.html
                 * link2text : 技术统计
                 * link2url : http://nba.sports.sina.com.cn/look_scores.php?id=2014120608
                 * player1 : 76人
                 * player1logo : http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/20.png
                 * player1logobig : http://p4.qhimg.com/t01d3db357326a5f9b7.png
                 * player1url : http://nba.sports.sina.com.cn/team.php?id=20
                 * player2 : 活塞
                 * player2logo : http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/8.png
                 * player2logobig : http://p4.qhimg.com/t014bc2a39f1ff5a13a.png
                 * player2url : http://nba.sports.sina.com.cn/team.php?id=8
                 * score : 108-101
                 * status : 2
                 * time : 12/07 08:30
                 */

                private String link1text;
                private String link1url;
                private String link2text;
                private String link2url;
                private String player1;
                private String player1logo;
                private String player1logobig;
                private String player1url;
                private String player2;
                private String player2logo;
                private String player2logobig;
                private String player2url;
                private String score;
                private int status;
                private String time;

                public String getLink1text() {
                    return link1text;
                }

                public void setLink1text(String link1text) {
                    this.link1text = link1text;
                }

                public String getLink1url() {
                    return link1url;
                }

                public void setLink1url(String link1url) {
                    this.link1url = link1url;
                }

                public String getLink2text() {
                    return link2text;
                }

                public void setLink2text(String link2text) {
                    this.link2text = link2text;
                }

                public String getLink2url() {
                    return link2url;
                }

                public void setLink2url(String link2url) {
                    this.link2url = link2url;
                }

                public String getPlayer1() {
                    return player1;
                }

                public void setPlayer1(String player1) {
                    this.player1 = player1;
                }

                public String getPlayer1logo() {
                    return player1logo;
                }

                public void setPlayer1logo(String player1logo) {
                    this.player1logo = player1logo;
                }

                public String getPlayer1logobig() {
                    return player1logobig;
                }

                public void setPlayer1logobig(String player1logobig) {
                    this.player1logobig = player1logobig;
                }

                public String getPlayer1url() {
                    return player1url;
                }

                public void setPlayer1url(String player1url) {
                    this.player1url = player1url;
                }

                public String getPlayer2() {
                    return player2;
                }

                public void setPlayer2(String player2) {
                    this.player2 = player2;
                }

                public String getPlayer2logo() {
                    return player2logo;
                }

                public void setPlayer2logo(String player2logo) {
                    this.player2logo = player2logo;
                }

                public String getPlayer2logobig() {
                    return player2logobig;
                }

                public void setPlayer2logobig(String player2logobig) {
                    this.player2logobig = player2logobig;
                }

                public String getPlayer2url() {
                    return player2url;
                }

                public void setPlayer2url(String player2url) {
                    this.player2url = player2url;
                }

                public String getScore() {
                    return score;
                }

                public void setScore(String score) {
                    this.score = score;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class BottomlinkBean {
                /**
                 * text : 常规赛赛程
                 * url : http://nba.sports.sina.com.cn/match_result.php
                 */

                private String text;
                private String url;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }

            public static class LiveBean {
                /**
                 * date : 2014-12-08
                 * liveurl : http://video.sina.com.cn/l/pl/sportstv/1691558.html
                 * player1 : 鹈鹕
                 * player1info : 胜8负10-西部11名
                 * player1location : (客)
                 * player1logo : http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/3.png
                 * player1logobig : http://p5.qhimg.com/t01d4114e4e03806e71.png
                 * player1url : http://nba.sports.sina.com.cn/team.php?id=3
                 * player2 : 湖人
                 * player2info : 胜5负15-西部14名
                 * player2location : (主)
                 * player2logo : http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/13.png
                 * player2logobig : http://p3.qhimg.com/t01f3bf12583c6c0c67.png
                 * player2url : http://nba.sports.sina.com.cn/team.php?id=13
                 * score : VS
                 * status : 0
                 * title : 今日热门  10:30开赛
                 */

                private String date;
                private String liveurl;
                private String player1;
                private String player1info;
                private String player1location;
                private String player1logo;
                private String player1logobig;
                private String player1url;
                private String player2;
                private String player2info;
                private String player2location;
                private String player2logo;
                private String player2logobig;
                private String player2url;
                private String score;
                private int status;
                private String title;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getLiveurl() {
                    return liveurl;
                }

                public void setLiveurl(String liveurl) {
                    this.liveurl = liveurl;
                }

                public String getPlayer1() {
                    return player1;
                }

                public void setPlayer1(String player1) {
                    this.player1 = player1;
                }

                public String getPlayer1info() {
                    return player1info;
                }

                public void setPlayer1info(String player1info) {
                    this.player1info = player1info;
                }

                public String getPlayer1location() {
                    return player1location;
                }

                public void setPlayer1location(String player1location) {
                    this.player1location = player1location;
                }

                public String getPlayer1logo() {
                    return player1logo;
                }

                public void setPlayer1logo(String player1logo) {
                    this.player1logo = player1logo;
                }

                public String getPlayer1logobig() {
                    return player1logobig;
                }

                public void setPlayer1logobig(String player1logobig) {
                    this.player1logobig = player1logobig;
                }

                public String getPlayer1url() {
                    return player1url;
                }

                public void setPlayer1url(String player1url) {
                    this.player1url = player1url;
                }

                public String getPlayer2() {
                    return player2;
                }

                public void setPlayer2(String player2) {
                    this.player2 = player2;
                }

                public String getPlayer2info() {
                    return player2info;
                }

                public void setPlayer2info(String player2info) {
                    this.player2info = player2info;
                }

                public String getPlayer2location() {
                    return player2location;
                }

                public void setPlayer2location(String player2location) {
                    this.player2location = player2location;
                }

                public String getPlayer2logo() {
                    return player2logo;
                }

                public void setPlayer2logo(String player2logo) {
                    this.player2logo = player2logo;
                }

                public String getPlayer2logobig() {
                    return player2logobig;
                }

                public void setPlayer2logobig(String player2logobig) {
                    this.player2logobig = player2logobig;
                }

                public String getPlayer2url() {
                    return player2url;
                }

                public void setPlayer2url(String player2url) {
                    this.player2url = player2url;
                }

                public String getScore() {
                    return score;
                }

                public void setScore(String score) {
                    this.score = score;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }
            }

            public static class LivelinkBean {
                /**
                 * text : 视频直播
                 * url : http://video.sina.com.cn/l/pl/sportstv/1691558.html
                 * videoicon : 1
                 */

                private String text;
                private String url;
                private String videoicon;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getVideoicon() {
                    return videoicon;
                }

                public void setVideoicon(String videoicon) {
                    this.videoicon = videoicon;
                }
            }
        }

        public static class TeammatchBean {
            /**
             * name : 老鹰
             * url : http://nba.sports.sina.com.cn/team_match.php?id=1
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
