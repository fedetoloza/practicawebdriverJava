package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class javascriptTests extends BaseTests {

    @Test
    public void testScrollToTable(){
        homePage.clickLargeaAndDeepDom().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }
}
