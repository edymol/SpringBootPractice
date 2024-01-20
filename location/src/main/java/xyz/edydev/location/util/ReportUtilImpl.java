package xyz.edydev.location.util;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Service;

@Service
public class ReportUtilImpl implements ReportUtil {

    @Override
    public void generatePieChart(String path, List<Object[]> data) {
        DefaultPieDataset<String> dataset = new DefaultPieDataset<String>();

        for (Object[] objects : data) {
            String locationType = objects[0].toString();
            Long count = Long.parseLong(objects[1].toString());
            dataset.setValue(locationType, count);
        }

        JFreeChart chart = ChartFactory.createPieChart(
                "Location Type Report",
                dataset,
                true, // include legend
                true,
                false
        );

        try {
            ChartUtils.saveChartAsJPEG(new File(path + "/pieChart.jpeg"), chart, 300, 300);
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception according to your application's requirements.
        }
    }
}
