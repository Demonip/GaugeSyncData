package com.easted.data.entity.mongoDSEntity;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by admin on 2017/10/10.
 */
@Document(collection = "REGION_APPLY_PROJECT_INFO")
public class Region_Apply_Project_InfoEntity {

    private String project_code;
    private String division_code;
    private String project_name;
    private String project_type;
    private String project_nature;
    private String start_year;
    private String end_year;
    private String total_money;
    private String place_code;
    private String place_code_detail;
    private String industry;
    private String scale_content;
    private String apply_date;
    private String permit_item_code;
    private String foreign_abroad_flag;
    private String total_money_explain;
    private String the_industry;
    private String is_country_security;
    private String security_approval_number;
    private String investment_mode;
    private String total_money_dollar;
    private String total_money_dollar_rate;
    private String project_capital_money ;
    private String project_capital_money_dollar;
    private String project_capital_money_dollar_rate;
    private String industrial_policy_type;
    private String industrial_policy ;
    private String other_investment_apply_info;
    private String transaction_both_info;
    private String merger_plan;
    private String merger_management_mode_scope;
    private String get_land_mode;
    private String land_area ;
    private String built_area;
    private String is_add_device ;
    private String import_device_number_money;
    private String project_site;
    private String china_total_money;
    private String node_code;
    private String validity_flag;
    private String source_timestamp;
    private String sync_time;
    private String sync_state;
}
