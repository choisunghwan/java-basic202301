# 자바 프로젝트 기본 설정

1. 플러그인 설치
- file > settings > 왼쪽  plugins 선택 
- 검색창: (korean 팩,material theme,icon etc..)

2. 폰트 크기 조절 설정
- 파일 > 설정 > 마우스 검색후 에디터 > 일반 택 > 
- ctrl+ wheel 로 글꼴크기 설정 체크

3. 한글 깨짐 설정
- shift 두번 누르고 검색창에 vm 검색
-  사용자 지정 vm 옵션 편집 클릭
- '-0file.encoding=UTF-8' 입력후 재실행
- 파일 > 설정 > 빌드도구 > gradle 탭 클릭
- 실행환경과 테스트 환경을 gradle에서 intellij로 변경