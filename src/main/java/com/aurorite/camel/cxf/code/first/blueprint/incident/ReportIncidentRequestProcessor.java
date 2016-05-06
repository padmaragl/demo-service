package com.aurorite.camel.cxf.code.first.blueprint.incident;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReportIncidentRequestProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		Logger LOG = LoggerFactory.getLogger(ReportIncidentRequestProcessor.class);
		LOG.debug("From route : " + exchange.getFromRouteId());
	}

}
