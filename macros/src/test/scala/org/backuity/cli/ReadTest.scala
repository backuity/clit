package org.backuity.cli

import org.backuity.matchete.JunitMatchers
import org.junit.Test

class ReadTest extends JunitMatchers {

    @Test
    def javaEnum(): Unit = {
        implicitly[Read[Season]].reads("winter") must_== Season.WINTER
    }
}
