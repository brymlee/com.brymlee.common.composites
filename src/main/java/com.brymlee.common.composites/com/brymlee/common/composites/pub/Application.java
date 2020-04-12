package com.brymlee.common.composites.pub;

import java.io.PrintWriter;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.TestPlan;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;

import static org.junit.platform.engine.discovery.DiscoverySelectors.selectPackage;
import static org.junit.platform.engine.discovery.ClassNameFilter.includeClassNamePatterns;
import static com.brymlee.common.composites.pub.TupleFactory.tuple;

public class Application{

	public static void main(final String[] arguments){
		final SummaryGeneratingListener summaryGeneratingListener = new SummaryGeneratingListener();
		final LauncherDiscoveryRequest launcherDiscoveryRequest = LauncherDiscoveryRequestBuilder
			.request()
			.selectors(selectPackage("com.brymlee.common.composites"))
			.filters(includeClassNamePatterns(".*Test"))
			.build();
		final Launcher launcher = LauncherFactory.create();
		final TestPlan testPaln = launcher.discover(launcherDiscoveryRequest);
		launcher.registerTestExecutionListeners(summaryGeneratingListener);
		launcher.execute(launcherDiscoveryRequest);
		final TestExecutionSummary testExecutionSummary = summaryGeneratingListener.getSummary();
		testExecutionSummary.printTo(new PrintWriter(System.out));
	}

}
