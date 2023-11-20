
## git


### 커밋 컨벤션
feat : 새로운 기능 추가
fix : 버그 수정
docs : 문서 수정
style : 코드 포맷팅, 세미콜론 누락, 코드 변경이 없는 경우
refactor : 코드 리펙토링
test : 테스트 코드, 리펙토링 테스트 코드 추가
chore : 빌드 업무 수정, 패키지 매니저 수정
<br>

예시: feat(ENG-14): 신규약정서 추가 작업




### git flow
1. Issue를 생성한다.
2. feature Branch를 생성한다.
3. Add - Commit - Push - Pull Request의 과정을 거친다.
4. 작업이 완료되면 stage 브랜치에 머지 후 검증서버에서 테스트를 거친다. 
4. 그 후 Pull Request가 작성, 다른 팀원이 Code Review를 한다.
5. Code Review가 완료되면 Pull Request 작성자가 master Branch에 merge 한다.
6. 그 후 master 브랜치에서 release/2023.11.20.001 의 브랜치를 만든 후 jenkins 에 release 브랜치를 빌드한다.
7. 문제가 생길시 다른날짜의 release 브랜치로 대체한다.


