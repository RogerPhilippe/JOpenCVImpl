import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.CvType;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.highgui.HighGui;

public class TestOpenCV {
   public static void main(String[] args) {
      System.loadLibrary("opencv_java454d");
      Mat img = Imgcodecs.imread("Lena.png");
     // HighGui.namedWindow("Bela Lena", HighGui.WINDOW_NORMAL);
      HighGui.imshow("Bela Lena", img);
      HighGui.waitKey();
      System.exit(0);
   }
}

