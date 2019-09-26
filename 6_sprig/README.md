repository  
https://github.com/riha-git/spring  

DB接続  
virtualboxを利用する場合  

・centosのファイアウォールの開放  
-> mariadb用のポート：3306  
  
・virtualboxのポートフォワーディング設定に、ホスト3306/ゲスト3306を追加  

・/etc/my.cnfに以下を追加  
[mysqld]  
port=3306  
[client]  
port=3306  

・dbにユーザーと権限を追加  
下記URL「2. 仮想マシン側MySQLの設定」参照
https://doruby.jp/users/goi/entries/%E4%BB%AE%E6%83%B3%E7%92%B0%E5%A2%83%E3%81%AEMySQL%E3%82%92%E4%BD%BF%E7%94%A8%E3%81%99%E3%82%8B%E3%81%9F%E3%82%81%E3%81%AE%E8%A8%AD%E5%AE%9A%E3%81%AB%E3%81%A4%E3%81%84%E3%81%A6

・spring側設定  

application.properties  
#接続用URL  
spring.datasource.url=jdbc:mariadb://localhost/work（利用するDB名）

mybatis-config.xml  
以下を追加  

```
<configuration>  
  <settings>  
  ・・・
　  <setting name="logImpl" value="STDOUT_LOGGING"/><!-- SQL文をコンソールで表示 -->  
```
