package com.talon.api.admin.bo;

import com.talon.api.admin.base.ApiResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class CompanyResponse{

    private String username;

    private String password;
}
