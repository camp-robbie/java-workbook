## README

# java-workbook 사용 가이드 (Fork → Clone → Upstream 동기화 → IntelliJ 팁)

> camp-robbie/java-workbook 저장소를 **처음부터 끝까지** 안전하게 사용하는 실전 가이드입니다.  
> IntelliJ IDEA + 터미널 기준이며, `master`, `lecture`, `solutions` 브랜치를 예시로 설명합니다.

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
  - **HTTPS + Personal Access Token**: 초기 진입 쉬움. (비밀번호 대신 PAT 입력)
  - **SSH 키**: 1회 설정 후 비밀번호 없이 사용 가능
- (선택) GitHub Desktop 또는 GitHub CLI(gh) 설치 → 인증 편의성 향상

---

## 1) 포크(Fork) & 클론(Clone)
1. GitHub에서 원본 저장소 `camp-robbie/java-workbook` 을 **Fork**합니다. (내 계정 아래 복사본 생성)
2. 클론(둘 중 택1)
   - **IntelliJ**: `Get from VCS` → 포크 URL 붙여넣기 → **Clone**
   - **터미널**
     ```bash
     git clone https://github.com/<your-username>/java-workbook.git
     cd java-workbook
     ```
3. (참고) Git 없이 파일만 받을 경우: 저장소 페이지 → **Code ▸ Download ZIP**

---

## 2) upstream 연결 & 로컬 브랜치 만들기 (최초 1회)
```bash
# 1) 원본 저장소(upstream) 추가 + 최신 이력 가져오기
git remote add upstream https://github.com/camp-robbie/java-workbook.git
git fetch upstream

# 2) 원본 브랜치로부터 로컬 브랜치 생성
git checkout -b master    upstream/master
git checkout -b lecture   upstream/lecture
git checkout -b solutions upstream/solutions
```
- 이제 원격은 두 개입니다.
  - `origin`  → 내 포크
  - `upstream` → 원본 저장소

---

## 3) 원본과 동기화 (가장 안전한 방법: rebase)
`master`, `lecture`, `solutions` 각각 반복합니다.
```bash
git checkout master
git fetch upstream
git pull --rebase upstream master
git push origin master      # 선택: 내 포크도 최신으로
```
```bash
git checkout lecture
git fetch upstream
git pull --rebase upstream lecture
git push origin lecture     # 선택
```
```bash
git checkout solutions
git fetch upstream
git pull --rebase upstream solutions
git push origin solutions   # 선택
```

> **IntelliJ**: `Git ▸ Pull…` 에서 `--rebase` 옵션 체크 가능

---

## 4) (옵션) 로컬을 원본으로 그대로 맞추기
**주의:** 로컬 수정이 덮어쓰여질 수 있습니다. 대상 브랜치를 **체크아웃하지 않은 상태**에서 실행하세요.
```bash
git fetch upstream solutions:solutions
git fetch upstream lecture:lecture
```
보다 강력하게 완전 일치시키려면(위험):
```bash
git checkout master
git fetch upstream
git reset --hard upstream/master
git push --force-with-lease origin master
```

---

## 5) 권장 작업 흐름
1. **동기화**: 위 3단계를 먼저 수행
2. **작업 브랜치 생성**: `git switch -c feat/풀이-001`
3. **커밋 & 푸시**
   ```bash
   git add -A
   git commit -m "feat: 풀이 001 추가"
   git push -u origin feat/풀이-001
   ```
4. **(선택) PR 열기**: 내 포크(origin) → 원본(upstream)으로 Pull Request
5. 작업이 끝나면 `master`로 돌아와 다시 동기화

---

## 6) IntelliJ 팁
- **Remotes 관리**: *Git ▸ Manage Remotes* 에서 `origin`, `upstream` 확인/추가
- **Fetch**: *Git ▸ Fetch* (원격 최신 상태만 갱신)
- **브랜치 체크아웃**: 우하단 브랜치 메뉴 → *Remote Branches* → 원하는 브랜치 **Checkout**
- **Pull**: *Git ▸ Pull…* → `upstream`/브랜치 선택, `--rebase` 옵션 사용 가능
- **Git 로그**: *Git Tool Window* (Alt+9)에서 커밋/브랜치 흐름 시각화

---

## 7) 자주 하는 실수 & 해결
- **upstream으로 푸시하려다 실패** → 권한상 정상입니다. 내 포크(`origin`)으로 푸시하고, 기여는 PR로 진행하세요.
- **HTTPS 푸시 시 비밀번호를 계속 물어봄** → GitHub는 일반 비밀번호 푸시를 막습니다. **PAT**을 비밀번호 칸에 넣거나 SSH를 사용하세요.
- **인증 계속 묻기** → GitHub CLI `gh auth login` 또는 OS 자격 증명 관리자 사용으로 캐싱.
- **로컬 수정이 있는데 브랜치 전환 안 됨** → `git stash`로 임시 저장 후 전환 → `git stash pop`으로 복원.
- **충돌 해결** → 파일의 충돌 표식(<<<<<<<, >>>>>>>) 수정 → `git add <파일>` → `git rebase --continue` (또는 `git merge --continue`).
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

> 필요하시면 Windows/macOS에 맞춘 **완전 자동화 스크립트**도 만들어 드릴게요.
