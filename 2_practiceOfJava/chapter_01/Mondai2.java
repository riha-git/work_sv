import java.util.List;
import java.util.ArrayList;

public class Mondai2
{
        static int gendar, age;
        //1:男性、2:女性、3:不明
        static int man = 1;
        static int woman = 2;
        static int unknown = 3;
 
        public static void main(String[] args)
        {

                // テストデータ格納
                List<TestDataBean> testData = new ArrayList<TestDataBean>();

                // テストデータ作成
                // data#1
                TestDataBean data = new TestDataBean();
                data.setGendar(unknown);
                data.setAge(-1);
                testData.add(data);
                // data#2
                data = new TestDataBean();
                data.setGendar(man);
                data.setAge(-1);
                testData.add(data);
                // data#3
                data = new TestDataBean();
                data.setGendar(man);
                data.setAge(1);
                testData.add(data);
                // data#4
                data = new TestDataBean();
                data.setGendar(man);
                data.setAge(20);
                testData.add(data);
                // data#5
                data = new TestDataBean();
                data.setGendar(woman);
                data.setAge(19);
                testData.add(data);
                // data#6
                data = new TestDataBean();
                data.setGendar(woman);
                data.setAge(20);
                testData.add(data);

                // 結果標準出力
                for(TestDataBean bn: testData)
                {
                        result(bn.getGendar(), bn.getAge());
                }
        }

        // 標準出力処理用関数
        static void result(int gendar, int age)
        {
                // ・性別が不明または年齢がマイナス:「判別不可能です。」
                if((gendar == unknown)||(age <= 0))
                {
                        System.out.println("判別不可能です。");
                }
                // ・性別が男性かつ年齢が20未満:「未成年の男性です。」
                else if((gendar == man)&&(age < 20))
                {
                        System.out.println("未成年の男性です。");
                }
                // ・性別が男性かつ年齢が20以上:「成人男性です。」
                else if((gendar == man)&&(age >= 20))
                {
                        System.out.println("成人男性です。");
                }
                // ・性別が女性かつ年齢が20未満:「未成年の女性です。」
                else if((gendar == woman)&&(age < 20))
                {
                        System.out.println("未成年の女性です。");
                }
                // ・性別が女性かつ年齢が20以上:「成人女性です。」
                else if((gendar == woman)&&(age >= 20))
                {
                        System.out.println("成人女性です。");
                }
                else
                {
                        // 処理なし
                }
        }
}

