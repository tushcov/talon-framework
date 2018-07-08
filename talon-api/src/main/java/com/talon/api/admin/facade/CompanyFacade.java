package com.talon.api.admin.facade;

import com.talon.api.admin.bo.CompanyRequest;
import com.talon.api.admin.bo.CompanyResponse;

public interface CompanyFacade {

    CompanyResponse createCompany(CompanyRequest request);

}
