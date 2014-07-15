package org.activiti.engine;

import java.util.Collection;
import java.util.Date;

import org.activiti.engine.delegate.DelegateExecution;

/**
 * 工作流
 * @author yinbp
 *
 */
public interface KPIService {
	
	public KPI buildKPI(DelegateExecution execution,Collection<String> candiates,Date taskCreateTime) throws ActivitiException;
	
}
