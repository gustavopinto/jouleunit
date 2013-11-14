package org.qualitune.jouleunit.test.coordinator.junit;

import org.junit.Test;
import org.qualitune.jouleunit.coordinator.junit.JUnitCoordinator;
import org.qualitune.jouleunit.windows.WindowsProfiler;

public class TestJUnitCoordinator {

	@Test
	public void testCoordinator() {

		JUnitCoordinator coordinator = new JUnitCoordinator(
				new WindowsProfiler(), SimpleTest.class);
		coordinator.runTestRun(1, 0, false);
	}
}
