public class InfoBean
{
        private String name;
        private String address;
        private String job;
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

        // 住所のセッター・ゲッター
        public String getAddress()
        {
                return address;
        }

        public void setAddress(String address)
        {
                this.address = address;
        }

        // 仕事のセッター・ゲッター
        public String getJob()
        {
                return job;
        }

        public void setJob(String job)
        {
                this.job = job;
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
