public class SampleBean
{
        private String name;
        private String furigana;
        private int age;

        // 名前のセッター・ゲッター
        public String getName()
        {
                return name;
        }

        public void setName(String name)
        {
                this.name = name;
        }

        // ふりがなのセッター・ゲッター
        public String getFurigana()
        {
                return furigana;
        }

        public void setFurigana(String furigana)
        {
                this.furigana = furigana;
        }

        // 年齢のセッター・ゲッター
        public int getAge()
        {
                return age;
        }

        public void setAge(int age)
        {
                this.age = age;
        }
}
