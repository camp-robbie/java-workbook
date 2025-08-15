## README

# java-workbook 사용 가이드 (Fork → Clone → Upstream 동기화 → IntelliJ 팁)

> `camp-robbie/java-workbook`를 **처음부터 끝까지** 안전하게 사용하는 실전 가이드입니다.  
> IntelliJ IDEA + 터미널 기준이며, `master`, `lecture`, `solutions` 브랜치를 예시로 설명합니다.

- 원본 저장소: `https://github.com/camp-robbie/java-workbook`
- 내 포크와 원본의 용어
  - **origin**: 내 깃허브 계정에 있는 포크
  - **upstream**: 원본 저장소

---

## 목차

1. [빠른 시작(요약)](#빠른-시작요약)
2. [0) 준비 (최초 1회)](#0-준비-최초-1회)
3. [1) 포크 & 클론](#1-포크--클론)
4. [2) upstream 연결 & 로컬 브랜치 생성](#2-upstream-연결--로컬-브랜치-생성)
5. [3) 원본과 동기화 (안전: rebase)](#3-원본과-동기화-안전-rebase)
6. [4) (옵션) 로컬을 원본과 동일하게 맞추기](#4-옵션-로컬을-원본과-동일하게-맞추기)
7. [5) 권장 작업 흐름](#5-권장-작업-흐름)
8. [6) IntelliJ 팁](#6-intellij-팁)
9. [7) 자주 하는 실수 & 해결](#7-자주-하는-실수--해결)
10. [8) 터미널 치트시트 (복붙용)](#8-터미널-치트시트-복붙용)
11. [부록 A. Git 핵심 개념 초간단 정리](#부록-a-git-핵심-개념-초간단-정리)
12. [부록 B. 포크 후 원본 신규 브랜치 따라잡기](#부록-b-포크-후-원본-신규-브랜치-따라잡기)

---

## 빠른 시작(요약)

```bash
# 최초 1회: upstream 추가 + 브랜치 만들기
git remote add upstream https://github.com/camp-robbie/java-workbook.git
git fetch upstream
git checkout -b master    upstream/master
git checkout -b lecture   upstream/lecture
git checkout -b solutions upstream/solutions

# 이후 매번: 원본 변경사항 rebase로 반영
git checkout master    && git pull --rebase upstream master
git checkout lecture   && git pull --rebase upstream lecture
git checkout solutions && git pull --rebase upstream solutions
```

> **팁**: 저장소에 `main`이 아닌 `master`를 사용합니다. (환경에 따라 `main`을 쓰는 프로젝트도 있으니 주의)

---

## 0) 준비 (최초 1회)

- Git 설치 (Windows: Git for Windows)
- GitHub 계정 로그인
- 터미널에서 사용자 정보 설정

```bash
git config --global user.name "Your Name"
git config --global user.email "you@example.com"
```

- 인증 방식 선택
  - **HTTPS + Personal Access Token(PAT)**: 비밀번호 대신 PAT 사용
  - **SSH 키**: 1회 설정 후 비밀번호 없이 사용
- (선택) GitHub Desktop 또는 GitHub CLI(`gh`) 설치 → 인증/작업 편의성

---

## 1) 포크 & 클론

1. GitHub에서 원본 저장소 `camp-robbie/java-workbook`을 **Fork**합니다. (내 계정 아래 복사본 생성)
2. 로컬로 클론 (둘 중 택1)
   - **IntelliJ**: *Get from VCS* → 포크 URL → **Clone**
   - **터미널**:

     ```bash
     git clone https://github.com/<your-username>/java-workbook.git
     cd java-workbook
     ```

3. (Git 없이 파일만 받을 경우) 저장소 페이지 → **Code ▸ Download ZIP**

---

## 2) upstream 연결 & 로컬 브랜치 생성

```bash
# 1) 원본 저장소(upstream) 추가 + 최신 이력 가져오기
git remote add upstream https://github.com/camp-robbie/java-workbook.git
git fetch upstream

# 2) 원본 브랜치로부터 로컬 브랜치 생성 (최초 1회)
git checkout -b master    upstream/master
git checkout -b lecture   upstream/lecture
git checkout -b solutions upstream/solutions
```

- 이제 원격은 두 개입니다.
  - **origin** → 내 포크
  - **upstream** → 원본 저장소

---

## 3) 원본과 동기화 (안전: rebase)

브랜치(`master`, `lecture`, `solutions`)마다 반복합니다.

```bash
git checkout master
git fetch upstream
git pull --rebase upstream master
git push origin master      # 선택: 내 포크도 최신으로

git checkout lecture
git fetch upstream
git pull --rebase upstream lecture
git push origin lecture     # 선택

git checkout solutions
git fetch upstream
git pull --rebase upstream solutions
git push origin solutions   # 선택
```

> **IntelliJ**: *Git ▸ Pull…* 에서 `--rebase` 옵션 체크 가능

---

## 4) (옵션) 로컬을 원본과 동일하게 맞추기

> **주의:** 로컬 수정이 덮어씌워질 수 있습니다. 대상 브랜치를 **체크아웃하지 않은 상태**에서 실행하세요.

```bash
# 원본 브랜치 내용을 로컬 동일 브랜치로 덮어쓰기(fetch+update-ref)
git fetch upstream solutions:solutions
git fetch upstream lecture:lecture
```

보다 강력하게 **완전 일치**시키려면(위험):

```bash
git checkout master
git fetch upstream
git reset --hard upstream/master
git push --force-with-lease origin master
```

---

## 5) 권장 작업 흐름

1) **동기화**: 위 3단계(rebase)를 먼저 수행  
2) **작업 브랜치 생성**:

```bash
git switch -c feat/풀이-001
```

3) **커밋 & 푸시**:

```bash
git add -A
git commit -m "feat: 풀이 001 추가"
git push -u origin feat/풀이-001
```

4) **(선택) PR 열기**: 내 포크(origin) → 원본(upstream)으로 Pull Request  
5) 작업이 끝나면 `master`로 돌아와 다시 동기화

---

## 6) IntelliJ 팁

- **Remotes 관리**: *Git ▸ Manage Remotes* 에서 `origin`, `upstream` 확인/추가
- **Fetch**: *Git ▸ Fetch* (원격 최신 상태만 갱신)
- **브랜치 체크아웃**: 우하단 브랜치 메뉴 → *Remote Branches* → 원하는 브랜치 **Checkout**
- **Pull**: *Git ▸ Pull…* → `upstream/브랜치` 선택, `--rebase` 사용 가능
- **Git 로그 보기**: *Git Tool Window* (Alt+9)에서 커밋/브랜치 흐름 시각화

---

## 7) 자주 하는 실수 & 해결

- **upstream으로 푸시하려다 실패**  
  → 권한상 정상입니다. 내 포크(`origin`)으로 푸시하고, 기여는 PR로 진행하세요.

- **HTTPS 푸시 시 비밀번호를 계속 물어봄**  
  → GitHub는 계정 비밀번호 푸시를 막습니다. **PAT**을 비밀번호 칸에 넣거나 **SSH**를 사용하세요.

- **인증 계속 묻기**  
  → `gh auth login` 사용 또는 OS 자격 증명 관리자에서 캐시 사용.

- **로컬 수정이 있어 브랜치 전환 불가**  
  → `git stash`로 임시 저장 후 전환 → `git stash pop`으로 복원.

- **충돌 해결(merge/rebase)**  
  → 파일의 충돌 표식(`<<<<<<<`, `=======`, `>>>>>>>`) 수정 → `git add <파일>`  
  → `git rebase --continue` (또는 `git merge --continue`).

- **원격/브랜치 연결 상태 확인**

  ```bash
  git remote -v
  git branch -vv
  ```

---

## 8) 터미널 치트시트 (복붙용)

```bash
# 최초 1회
git remote add upstream https://github.com/camp-robbie/java-workbook.git
git fetch upstream
git checkout -b master    upstream/master
git checkout -b lecture   upstream/lecture
git checkout -b solutions upstream/solutions

# 이후 최신 반영 (안전: rebase)
git checkout master    && git pull --rebase upstream master
git checkout lecture   && git pull --rebase upstream lecture
git checkout solutions && git pull --rebase upstream solutions

# (옵션) 로컬을 원본으로 '그대로' 맞추기 (체크아웃 X)
git fetch upstream solutions:solutions
git fetch upstream lecture:lecture
```

---

## 부록 A. Git 핵심 개념 초간단 정리

| 명령어 | 의미 | 언제 쓰나 | 예시 |
|---|---|---|---|
| `commit` | 로컬 변경을 기록 | 파일을 수정/저장했을 때 | `git commit -m "메시지"` |
| `push` | 로컬 커밋을 깃허브에 업로드 | GitHub에 반영할 때 | `git push origin master` |
| `pull` | GitHub 변경을 가져오고 **합침** | 다른 사람 변경 반영할 때 | `git pull origin master` |
| `fetch` | GitHub 변경을 **가져오기만** 함 | 합치기 전 확인할 때 | `git fetch upstream` |

- 쉬운 비유
  - **commit**: 내 컴퓨터에 저장
  - **push**: 깃허브에 업로드
  - **pull**: 깃허브에서 가져와 **합치기**
  - **fetch**: 깃허브에서 가져오기만

---

## 부록 B. 포크 후 원본 신규 브랜치 따라잡기

```bash
# 기본 브랜치로 이동 후 내 포크 동기화(선택)
git checkout master       # 또는 main
git pull origin master    # 또는 main
git push origin master    # 변경 있으면 반영

# (최초 1회) 원본을 upstream 이름으로 등록
git remote add upstream https://github.com/camp-robbie/java-workbook.git

# 원본에서 최신 브랜치/이력 가져오기
git fetch upstream

# 예: lecture 브랜치 새로 가져오기
git checkout -b lecture upstream/lecture
git push origin lecture

# 예: solutions 브랜치 새로 가져오기
git checkout -b solutions upstream/solutions
git push origin solutions

# 필요 시 브랜치 전환
git checkout lecture
git checkout solutions
```

