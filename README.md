# practice-kotlin
Kotlin練習用

## Dockerで環境構築
- イメージ作成
```bash
docker build ./docker -t kotlin_image
```
- コンテナ作成
```bash
docker run -it -d --name kotlin_container kotlin_image
```
- コンテナへ入る
```bash
docker exec -it kotlin_container bash
```
## コンパイル
```bash
kotlinc hello.kt -include-runtime -d hello.jar
```
## 実行
```bash
java -jar hello.jar
```
