Summer Coding

1. AWS에서 Ubuntu로 서버를 하나 생성한다.
2. 만든 서버 내에 JDK, maven, tomcat을 설치한다.
3. git clone을 이용해 TodoList를 서버에 받는다.
4. git pull을 통해 최신 업데이트 버전을 받아온다.
5. mvn clean package -Dmaven.test.skip=true(Junit 테스트로 인해 빌드가 실패하기 때문에 붙임) 이라는 명령어를 통해 maven 빌드
6. 폴더 내의 target 폴더로 이동
7. tomcat/webapps/ROOT이라는 이름의 폴더를 삭제
8. TodoList/target의 안에 있는 Submit-SNAPSHOT이라는 폴더를 tomcat/webapps 폴더 내에 ROOT라는  이름으로 변경해 이동
9. sudo iptables -t nat -A PREROUTING -p tcp --dport 80 -j REDIRECT --to-port 8080 sudo service iptables save sudo service iptables reload 라는 명령어로 포트포워딩을 통해 80번 포트로 들어오는 요청을 8080포트로 전송
10. tomcat/bin 내의 startup.sh를 실행시킴으로서 서버를 통해 배포
