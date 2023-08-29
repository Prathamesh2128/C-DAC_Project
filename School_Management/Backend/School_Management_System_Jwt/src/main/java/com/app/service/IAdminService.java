package com.app.service;

import com.app.request.AdminRequest;
import com.app.response.AdminResponse;

public interface IAdminService {
	AdminResponse registerAdmin(AdminRequest adminRequest);
}
