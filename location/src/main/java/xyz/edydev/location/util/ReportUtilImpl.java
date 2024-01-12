package xyz.edydev.location.util;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReportUtilImpl implements ReportUtil {

    @Override
    public void generatePieChart(String path, List<Object[]> data) {
        DefaultPieDataset dataset = new DefaultPieDataset();

        for (Object[] objects : data) {
            dataset.setValue(objects[0].toString(), Double.parseDouble(objects[1].toString()));
        }

        JFreeChart chart = ChartFactory.createPieChart(
                "Location Type Report",
                dataset,
                true, // include legend
                true,
                false
        );

        try {
            ChartUtils.saveChartAsJPEG(new File(path), chart, 300, 300);
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception according to your application's requirements.
        }
    }
}
