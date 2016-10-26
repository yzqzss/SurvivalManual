package org.ligi.survivalmanual

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class TheImageLinker {

    @Test
    fun testLinkingWorks() {
        assertThat(ImageLogic.linkImagesInMarkDown("foo ![Figure 4-7 Butterfly Closure](fig04-07.png)")).isEqualTo("foo [![Figure 4-7 Butterfly Closure](fig04-07.png)](fig04-07.png)")
    }

    @Test
    fun testLinkingWorksForMoreThanOneImage() {
        assertThat(ImageLogic.linkImagesInMarkDown("foo ![Figure 4-7 Butterfly Closure](fig04-07.png) bar ![Figure 5-8 Butterfly Closure](fig05-08.png) yo")).isEqualTo("foo [![Figure 4-7 Butterfly Closure](fig04-07.png)](fig04-07.png) bar [![Figure 5-8 Butterfly Closure](fig05-08.png)](fig05-08.png) yo")
    }
}