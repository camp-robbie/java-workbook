# README

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
6. [3-1) 기존 브랜치를 Upstream 최신으로 만드는 3가지 방법](#3-1-기존-브랜치를-upstream-최신으로-만드는-3가지-방법)
7. [4) (옵션) 로컬을 원본과 동일하게 맞추기](#4-옵션-로컬을-원본과-동일하게-맞추기)
8. [5) 권장 작업 흐름](#5-권장-작업-흐름)
  - [5-1) 브랜치 네이밍 규칙 & 생성 (3단계)](#5-1-브랜치-네이밍-규칙--생성-3단계)
  - [5-2) 문제 풀기 & 커밋 가이드 (4단계)](#5-2-문제-풀기--커밋-가이드-4단계)
  - [5-3) 제출(푸시 & PR) 방법](#5-3-제출푸시--pr-방법)
9. [6) IntelliJ 팁](#6-intellij-팁)
10. [7) 자주 하는 실수 & 해결](#7-자주-하는-실수--해결)
11. [8) 터미널 치트시트 (복붙용)](#8-터미널-치트시트-복붙용)
12. [부록 A. Git 핵심 개념 초간단 정리](#부록-a-git-핵심-개념-초간단-정리)
13. [부록 B. 포크 후 원본 신규 브랜치 따라잡기](#부록-b-포크-후-원본-신규-브랜치-따라잡기)

---

## 빠른 시작(요약)

```bash
# (최초 1회) upstream 추가 + 브랜치 만들기
git remote add upstream https://github.com/camp-robbie/java-workbook.git
git fetch upstream
git checkout -b master    upstream/master
git checkout -b lecture   upstream/lecture
git checkout -b solutions upstream/solutions

# (매번) 원본 변경사항을 rebase로 반영
git checkout master    && git pull --rebase upstream master
git checkout lecture   && git pull --rebase upstream lecture
git checkout solutions && git pull --rebase upstream solutions
```

> **팁**: 이 저장소는 기본 브랜치로 `master`를 사용합니다. (프로젝트에 따라 `main`을 쓰는 곳도 있으니 주의)

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

> **왜 rebase?** 히스토리가 깔끔해지고(불필요한 merge 커밋 감소), 충돌 해결도 한 번에 직관적으로 하기 좋습니다. 팀 정책에 따라 merge를 사용하기도 하니 아래 3가지 업데이트 방법도 함께 참고하세요.

---

## 3-1) 기존 브랜치를 Upstream 최신으로 만드는 3가지 방법

> **공통 주의:** 병합/갱신하려는 **로컬 브랜치와 Upstream 브랜치가 정확히 매칭**되는지 먼저 확인하세요.  
> 확인: `git branch -vv`, `git remote -v`

### 1) Fetch + Merge

- `upstream/브랜치`의 최신 내용을 **가져온 뒤**, 현재 체크아웃한 **로컬 브랜치에 merge** 합니다.
- 팀에서 **명시적 merge 커밋**을 선호하거나, 히스토리를 보존하고 싶을 때 사용합니다.

```bash
git fetch upstream

git checkout master
git merge upstream/master

git checkout lecture
git merge upstream/lecture

git checkout solutions
git merge upstream/solutions
```

> **주의!** merge 하기 전에 *현재 체크아웃된 로컬 브랜치*가 병합 대상과 같은지 꼭 확인하세요. (예: `master` ↔ `upstream/master`)

---

### 2) Pull (가져오면서 병합)

- 체크아웃한 로컬 브랜치에 대해 **가져오기+병합**을 한 번에 수행합니다.

```bash
# master 예시
git checkout master
git pull upstream master

# lecture 예시
git checkout lecture
git pull upstream lecture

# solutions 예시
git checkout solutions
git pull upstream solutions
```

> `git pull = git fetch + git merge` (기본 설정 기준)  
> rebase로 가져오려면 `git pull --rebase upstream master` 처럼 `--rebase` 옵션을 붙이세요.

---

### 3) Fetch(Refspec) — 로컬 브랜치 체크아웃 없이 갱신

- **체크아웃하지 않은 상태**에서 `upstream/<branch>`를 **로컬 `<branch>` 참조로 직접 갱신**합니다.
- 기본적으로 **fast-forward만 허용**합니다(로컬에 앞선 커밋이 있으면 실패). 안전하게 **동기화만** 하고 싶을 때 유용합니다.

```bash
# 문법: git fetch <원격> <가져올브랜치>:<갱신할로컬브랜치>

# master 최신 반영
# 설명: upstream의 master 브랜치를 내 로컬 master 브랜치에 반영
git fetch upstream master:master

# lecture 최신 반영
git fetch upstream lecture:lecture

# solutions 최신 반영
git fetch upstream solutions:solutions
```

> **팁:** 강제 갱신하려면 `+`를 붙입니다(위험). 예: `git fetch upstream +master:master`  
> 다만 로컬 커밋을 잃을 수 있으니 정말 필요한 경우에만 사용하세요.

---

## 4) (옵션) 로컬을 원본과 동일하게 '완전 일치' 시키기

> **위험:** 로컬 수정이 덮어씌워질 수 있습니다. 대상 브랜치를 **체크아웃하지 않은 상태**에서 실행하세요.

```bash
# 안전한 동기화(FF만 허용): 체크아웃하지 않은 상태에서
git fetch upstream solutions:solutions
git fetch upstream lecture:lecture
```

보다 강력하게 **완전 일치**시키려면(이력 재작성):

```bash
git checkout master
git fetch upstream
git reset --hard upstream/master
git push --force-with-lease origin master
```

---

## 5) 권장 작업 흐름

1) **동기화**: 위 [3) rebase] 또는 [3-1) 3가지 방법] 중 팀 규칙에 맞는 방식으로 최신화
2) **작업 브랜치 생성**
3) **문제 풀이 & 작은 단위 커밋**
4) **푸시 & PR 생성**
5) 작업 종료 후 `master`로 돌아와 다시 동기화

### 5-1) 브랜치 네이밍 규칙 & 생성 (3단계)

- **브랜치 범위**: **문제 항목 1개에 브랜치 1개**
- **이름 규칙**: `feature/[이름]-[패키지명]-solutions`
  - 예) “기본형과 형변환 이해” 항목 → 패키지명 `primitiveconversion` 가정  
    → `feature/choi-wonbin-primitiveconversion-solutions`

**IntelliJ GUI**

- 좌하단 **Git** 탭 → *Local* 에서 `master` 우클릭 → **New Branch…**  
  이름에 `feature/[이름]-[패키지명]-solutions` 입력 → 생성

**터미널**

```bash
git checkout -b feature/[이름]-[패키지명]-solutions
# 예시
git checkout -b feature/choi-wonbin-primitiveconversion-solutions
```

---

### 5-2) 문제 풀기 & 커밋 가이드 (4단계)

- **작업 단위**: **문제 1개당 커밋 1개**(작고 의미 있게)
- **커밋 메시지 예시**
  - `feat: [primitiveconversion] Q1 구현`
  - `fix: [primitiveconversion] Q1 변수명 수정`

**IntelliJ GUI**

1) 좌측 상단 **Commit** 탭 → *Changes*에서 완료한 파일 선택
2) 메시지 입력 → 아래 **Commit** 버튼 클릭
3) 좌하단 **Git** 탭에서 내 커밋 이력이 보이면 성공

**터미널**

```bash
git add <파일>
git commit -m "feat: [primitiveconversion] Q1 구현"
```

---

### 5-3) 제출(푸시 & PR) 방법

- **PR 범위**: **문제 항목 1개에 PR 1개**

**1) GitHub에 푸시**

- **IntelliJ GUI**: 좌하단 **Git** 탭 → *Local*에서 작업 브랜치 우클릭 → **Push**  
  → 내용 확인 후 **Push** 클릭 → *Remote*에 작업 브랜치 생성 확인 →  
  GitHub 포크 저장소에서 해당 브랜치가 보이면 성공

- **터미널**

```bash
git push -u origin feature/[이름]-[패키지명]-solutions
# 예시
git push -u origin feature/choi-wonbin-primitiveconversion-solutions
```

**2) PR 생성**

- GitHub(내 포크)에서 방금 푸시한 브랜치로 이동 → **Compare & pull request**
- 대상 저장소: **upstream** (`camp-robbie/java-workbook`), 대상 브랜치: 과제 지침에 따름
- 제목/설명에 항목명, 주요 변경점, 테스트 방법 등을 적고 제출

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

# 이후 최신 반영 (선호: rebase)
git checkout master    && git pull --rebase upstream master
git checkout lecture   && git pull --rebase upstream lecture
git checkout solutions && git pull --rebase upstream solutions

# (대안) 3가지 업데이트 방법
# 1) Fetch + Merge
git fetch upstream && git checkout master && git merge upstream/master
git checkout lecture  && git merge upstream/lecture
git checkout solutions && git merge upstream/solutions

# 2) Pull
git checkout master    && git pull upstream master
git checkout lecture   && git pull upstream lecture
git checkout solutions && git pull upstream solutions

# 3) Fetch(Refspec) — 체크아웃 없이
git fetch upstream master:master
git fetch upstream lecture:lecture
git fetch upstream solutions:solutions

# 작업용 브랜치 생성(규칙)
git checkout -b feature/[이름]-[패키지명]-solutions

# 커밋 & 푸시
git add -A
git commit -m "feat: [패키지명] Q1 구현"
git push -u origin feature/[이름]-[패키지명]-solutions
```

---

## 부록 A. Git 핵심 개념 초간단 정리

| 명령어 | 의미 | 언제 쓰나 | 예시 |
|---|---|---|---|
| `commit` | 로컬 변경을 기록 | 파일을 수정/저장했을 때 | `git commit -m "메시지"` |
| `push` | 로컬 커밋을 깃허브에 업로드 | GitHub에 반영할 때 | `git push origin master` |
| `pull` | GitHub 변경을 가져오고 **합침** | 다른 사람 변경 반영할 때 | `git pull upstream master` |
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

--- 

> 이 README는 **브랜치 네이밍 규칙(3단계)**, **문제 풀이 & 커밋 가이드(4단계)**, **제출(푸시 & PR)** 을 포함해 실전 흐름에 맞춰 구성되었습니다.
