package tests;

import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

import java.util.logging.Logger;

public class TestData extends ExcelDataConfig {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(TestData.class));
    public TestData () {
        super("src\\test\\resources\\ExcelSheet\\LoginTest.xlsx");
    }
    @DataProvider
    public Object[][] OrangeHRMLogin() {
        int rows = getRowCount("Sheet1");
        int col = getColumnCount("Sheet1");
        LOGGER.info("row = "+ rows + " columns = "+ col);
        LOGGER.info("Sheet1");
        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Sheet1", i, j);
            }
        }
        return data;
    }
}
