package io.shipwright.sample.java.liberty;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import io.shipwright.sample.java.liberty.health.HealthCheckResource;
import io.shipwright.sample.java.liberty.health.HealthCheckServiceImpl;

@ApplicationPath("/api")
public class LibertyApplication extends Application {

	@Override
	public Set<Object> getSingletons() {
		final Set<Object> set = new HashSet<>();
		set.add(new HealthCheckResource(new HealthCheckServiceImpl()));
		return set;
	}
}
