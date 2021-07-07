package com.gatz.discovery.modules.cidm.service;

import com.gatz.discovery.core.generic.GenericService;
import com.gatz.discovery.modules.cidm.model.TTown;

public interface TTownService extends GenericService<TTown, Long> {

	TTown selectByPrimaryKey(Long townId);
}
