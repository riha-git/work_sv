### VagrantのBoxファイル
下記からダウンロード  
https://drive.google.com/file/d/1xBrQv6Pkqyxt5lu290PKxKAKbzFcJUrt/view?usp=sharing

VM内容  
CentOS Linux release 7.6.1810 (Core)  
Ver 15.1 Distrib 5.5.60-MariaDB

学習用DB  
work

学習用table  
product  
member  

学習用データ（登録済）  
/var/lib/mysql/ddl/member.ddl  
/var/lib/mysql/ddl/product.ddl  
/var/lib/mysql/dml/member.dml  
/var/lib/mysql/dml/product.dml  

### install方法  
1. ダウンロードしたboxファイルのディレクトリに移動し、下記コマンドを実行  
vagrant box add <任意のbox名> dbVM.box  

2. 下記のコマンドで、登録したboxが表示されることを確認  
vagrant box list  

3. 任意のディレクトリ配下で、vagrantfile作成  
vagrant init <任意のbox名>  

### VM起動/停止方法

1. varantfileを作成した場所でVM起動  
vagrant up  

2. 停止
vagrant halt

### DB起動/停止手順
1. ネットワーク確認  
Virtualboxで起動中のネットワークを確認   
ネットワーク > 高度「ポートフォワーディングルール」  
ホストip:ホストポート, ゲストポート 

2. VM起動後sshにssh接続（Tera Termなど）  
user: root  
pw: vagrant  

3. サーバー起動  
systemctl start mariadb

4. DBにログイン  
mysql -u root -p  
pw: なし（Enter）

5. DB選択  
use work;

6. サーバー停止  
systemctl stop mariadb
