package com.finzly.cartogo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.cartogo.dao.AccessKeyDao;
import com.finzly.cartogo.entity.AccessKey;


@Service
public class AccessKeyService {
	@Autowired
	AccessKeyDao accessKeyDao;

	public List<AccessKey> getAccessKey() {
		return accessKeyDao.getAccessKey();
	}

	public String saveAccessKey(AccessKey accessKey) {
		return accessKeyDao.saveAccessKey(accessKey);
	}

	public List<AccessKey> getAccessKeyById(Long id) {
		return accessKeyDao.getAccessKeyById(id);
	}

	public String editAccessKeyById(Long id, AccessKey accessKey) {
		return accessKeyDao.editAccessKeyById(id, accessKey);
	}

	public String deleteAccessKeyById(Long id) {
		return accessKeyDao.deleteAccessKeyById(id);
	}

	public List<AccessKey> getAccessKeyByCarPackage(String carPackage) {
		return accessKeyDao.getAccessKeyByCarPackage(carPackage);
	}

	public List<AccessKey> getAccessKeyByHours(Integer hours) {
		return accessKeyDao.getAccessKeyByHours(hours);
	}

}
