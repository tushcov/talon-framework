package com.talon.api.admin.bo;

import com.talon.api.admin.base.ApiRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyRequest extends ApiRequest {


    private String username;

    private String password;

}
