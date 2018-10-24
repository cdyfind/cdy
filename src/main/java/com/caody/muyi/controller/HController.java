package com.caody.muyi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HController {

    /**
     * 主题
     * @return
     */
    @RequestMapping("/h1")
    public String index(){
        return "h/index";
    }

    @RequestMapping("/index_v1")
    public String index_v1(){
        return "h/index_v1";
    }
    @RequestMapping("/index_v2")
    public String index_v2(){
        return "h/index_v2";
    }
    @RequestMapping("/index_v3")
    public String index_v3(){
        return "h/index_v3";
    }
    @RequestMapping("/index_v4")
    public String index_v4(){
        return "h/index_v4";
    }
    @RequestMapping("/index_v5")
    public String index_v5(){
        return "h/index_v5";
    }

    /**
     * 布局
     * @return
     */
    @RequestMapping("/layouts")
    public String layouts(){
        return "h/layouts";
    }

    /**
     * 统计图表
     * @return
     */
    @RequestMapping("/graph_echarts")
    public String graph_echarts(){
        return "h/graph_echarts";
    }
    @RequestMapping("/graph_flot")
    public String graph_flot(){
        return "h/graph_flot";
    }
    @RequestMapping("/graph_morris")
    public String graph_morris(){
        return "h/graph_morris";
    }
    @RequestMapping("/graph_rickshaw")
    public String graph_rickshaw(){
        return "h/graph_rickshaw";
    }
    @RequestMapping("/graph_peity")
    public String graph_peity(){
        return "h/graph_peity";
    }
    @RequestMapping("/graph_sparkline")
    public String graph_sparkline(){
        return "h/graph_sparkline";
    }
    @RequestMapping("/graph_metrics")
    public String graph_metrics(){
        return "h/graph_metrics";
    }

    /**
     * 信箱
     * @return
     */
    @RequestMapping("/mailbox")
    public String mailbox(){
        return "h/mailbox";
    }
    @RequestMapping("/mail_detail")
    public String mail_detail(){
        return "h/mail_detail";
    }
    @RequestMapping("/mail_compose")
    public String mail_compose(){
        return "h/mail_compose";
    }

    /**
     * 表单
     * @return
     */
    @RequestMapping("/form_basic")
    public String form_basic(){
        return "h/form_basic";
    }
    @RequestMapping("/form_validate")
    public String form_validate(){
        return "h/form_validate";
    }
    @RequestMapping("/form_advanced")
    public String form_advanced(){
        return "h/form_advanced";
    }
    @RequestMapping("/form_wizard")
    public String form_wizard(){
        return "h/form_wizard";
    }

    /**
     * 表单/文件上传
     * @return
     */
    @RequestMapping("/form_webuploader")
    public String form_webuploader(){
        return "h/form_webuploader";
    }
    @RequestMapping("/form_file_upload")
    public String form_file_upload(){
        return "h/form_file_upload";
    }
    @RequestMapping("/form_avatar")
    public String form_avatar(){
        return "h/form_avatar";
    }
    /**
     * 表单/编辑器
     */
    @RequestMapping("/form_editors")
    public String form_editors(){
        return "h/form_editors";
    }
    @RequestMapping("/form_simditor")
    public String form_simditor(){
        return "h/form_simditor";
    }
    @RequestMapping("/form_markdown")
    public String form_markdown(){
        return "h/form_markdown";
    }
    @RequestMapping("/code_editor")
    public String code_editor(){
        return "h/code_editor";
    }

    /**
     * 表单
     * @return
     */
    @RequestMapping("/suggest")
    public String suggest(){
        return "h/suggest";
    }
    @RequestMapping("/layerdate")
    public String layerdate(){
        return "h/layerdate";
    }

    /**
     * 页面
     * @return
     */
    @RequestMapping("/contacts")
    public String contacts(){
        return "h/contacts";
    }
    @RequestMapping("/profile")
    public String profile(){
        return "h/profile";
    }
    @RequestMapping("/projects")
    public String projects(){
        return "h/projects";
    }
    @RequestMapping("/project_detail")
    public String project_detail(){
        return "h/project_detail";
    }
    @RequestMapping("/teams_board")
    public String teams_board(){
        return "h/teams_board";
    }
    @RequestMapping("/social_feed")
    public String social_feed(){
        return "h/social_feed";
    }
    @RequestMapping("/clients")
    public String clients(){
        return "h/clients";
    }
    @RequestMapping("/file_manager")
    public String file_manager(){
        return "h/file_manager";
    }
    @RequestMapping("/calendar")
    public String calendar(){
        return "h/calendar";
    }
    @RequestMapping("/blog")
    public String blog(){
        return "h/blog";
    }
    @RequestMapping("/article")
    public String article(){
        return "h/article";
    }
    @RequestMapping("/faq")
    public String faq(){
        return "h/faq";
    }
    @RequestMapping("/timeline")
    public String timeline(){
        return "h/timeline";
    }
    @RequestMapping("/timeline_v2")
    public String timeline_v2(){
        return "h/timeline_v2";
    }
    @RequestMapping("/pin_board")
    public String pin_board(){
        return "h/pin_board";
    }
    @RequestMapping("/invoice")
    public String invoice(){
        return "h/invoice";
    }
    @RequestMapping("/invoice_print")
    public String invoice_print(){
        return "h/invoice_print";
    }
    @RequestMapping("/search_results")
    public String search_results(){
        return "h/search_results";
    }
    @RequestMapping("/forum_main")
    public String forum_main(){
        return "h/forum_main";
    }
    @RequestMapping("/chat_view")
    public String chat_view(){
        return "h/chat_view";
    }
    @RequestMapping("/webim")
    public String webim(){
        return "h/webim";
    }
    @RequestMapping("/login")
    public String login(){
        return "h/login";
    }
    @RequestMapping("/login_v2")
    public String login_v2(){
        return "h/login_v2";
    }
    @RequestMapping("/register")
    public String register(){
        return "h/register";
    }
    @RequestMapping("/lockscreen")
    public String lockscreen(){
        return "h/lockscreen";
    }
    @RequestMapping("/404")
    public String a404(){
        return "h/404";
    }
    @RequestMapping("/500")
    public String a500(){
        return "h/500";
    }
    @RequestMapping("/empty_page")
    public String empty_page(){
        return "h/empty_page";
    }

    /**
     * ui元素
     */
    @RequestMapping("/typography")
    public String typography(){
        return "h/typography";
    }

    @RequestMapping("/fontawesome")
    public String fontawesome(){
        return "h/fontawesome";
    }

    @RequestMapping("/glyphicons")
    public String glyphicons(){
        return "h/glyphicons";
    }

    @RequestMapping("/iconfont")
    public String iconfont(){
        return "h/iconfont";
    }

    @RequestMapping("/draggable_panels")
    public String draggable_panels(){
        return "h/draggable_panels";
    }

    @RequestMapping("/agile_board")
    public String agile_board(){
        return "h/agile_board";
    }

    @RequestMapping("/buttons")
    public String buttons(){
        return "h/buttons";
    }

    @RequestMapping("/tabs_panels")
    public String tabs_panels(){
        return "h/tabs_panels";
    }

    @RequestMapping("/notifications")
    public String notifications(){
        return "h/notifications";
    }

    @RequestMapping("/badges_labels")
    public String badges_labels(){
        return "h/badges_labels";
    }

    @RequestMapping("/grid_options")
    public String grid_options(){
        return "h/grid_options";
    }

    @RequestMapping("/plyr")
    public String plyr(){
        return "h/plyr";
    }

    @RequestMapping("/layer")
    public String layer(){
        return "h/layer";
    }

    @RequestMapping("/modal_window")
    public String modal_window(){
        return "h/modal_window";
    }

    @RequestMapping("/sweetalert")
    public String sweetalert(){
        return "h/sweetalert";
    }

    @RequestMapping("/jstree")
    public String jstree(){
        return "h/jstree";
    }

    @RequestMapping("/tree_view")
    public String tree_view(){
        return "h/tree_view";
    }

    @RequestMapping("/nestable_list")
    public String nestable_list(){
        return "h/nestable_list";
    }

    @RequestMapping("/toastr_notifications")
    public String toastr_notifications(){
        return "h/toastr_notifications";
    }

    @RequestMapping("/diff")
    public String diff(){
        return "h/diff";
    }

    @RequestMapping("/spinners")
    public String spinners(){
        return "h/spinners";
    }

    @RequestMapping("/widgets")
    public String widgets(){
        return "h/widgets";
    }

    /**
     * 表格
     */
    @RequestMapping("/table_basic")
    public String table_basic(){
        return "h/table_basic";
    }

    @RequestMapping("/table_data_tables")
    public String table_data_tables(){
        return "h/table_data_tables";
    }

    @RequestMapping("/table_jqgrid")
    public String table_jqgrid(){
        return "h/table_jqgrid";
    }

    @RequestMapping("/table_foo_table")
    public String table_foo_table(){
        return "h/table_foo_table";
    }

    @RequestMapping("/table_bootstrap")
    public String table_bootstrap(){
        return "h/table_bootstrap";
    }
}
