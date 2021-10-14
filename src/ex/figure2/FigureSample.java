package ex.figure2;

import basic.figure2.Circle;
import basic.figure2.Rectangle;
import basic.figure2.Triangle;

import java.util.ArrayList;
import java.util.Arrays;

//図形の面積
class FigureSample {
    public static void main(String[] args) {
        //インスタンスの作成
        //ArrayListで宣言
        List<basic.figure2.Figure> figures = new ArrayList<>();
        figures.addAll(Arrays.asList(
                new basic.figure2.Rectangle(10,20),
                new basic.figure2.Triangle(20,15),
                new basic.figure2.Circle(10)
        ));

        //出力
        for (basic.figure2.Figure figure:figures) {
            System.out.println(figure);

        }
    }

        //出力
        for (Figure figure:figures) {
            System.out.println(figure.getArea());
            //System.out.println(figure);
        }
    }
}
