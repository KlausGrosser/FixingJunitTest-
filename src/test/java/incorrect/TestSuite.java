package incorrect;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses( {TestEmpShuffle.class, TestEmpListSize.class})

public class TestSuite {
}
