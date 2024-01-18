import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

public class First {
    public static void main(String[] args) {

        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        Mat mat = Mat.eye(3, 3, CvType.CV_8UC3);
        System.out.println(mat.dump());

        System.out.println(CvType.typeToString(mat.type()));
    }
}
