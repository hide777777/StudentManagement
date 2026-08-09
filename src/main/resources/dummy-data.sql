-- studentテーブルを作り直してダミーデータを投入するSQL
-- 既存のstudentテーブルを削除して、新しい列構成で作り直します
DROP TABLE IF EXISTS student;

CREATE TABLE student (
  id         INT AUTO_INCREMENT PRIMARY KEY,
  name       VARCHAR(100),
  kana_name  VARCHAR(100),
  nickname   VARCHAR(100),
  email      VARCHAR(255),
  area       VARCHAR(100),
  age        INT,
  sex        VARCHAR(10)
);

INSERT INTO student (name, kana_name, nickname, email, area, age, sex) VALUES
  ('山田太郎', 'ヤマダタロウ',   'タロ',  'taro@example.com',    '東京',   25, '男性'),
  ('鈴木一郎', 'スズキイチロウ', 'イチ',  'ichiro@example.com',  '大阪',   30, '男性'),
  ('田中花子', 'タナカハナコ',   'ハナ',  'hana@example.com',    '北海道', 22, '女性'),
  ('佐藤良子', 'サトウリョウコ', 'リョウ', 'ryoko@example.com',   '福岡',   28, '女性'),
  ('伊藤悠',   'イトウハルカ',   'ハル',  'haruka@example.com',  '愛知',   35, 'その他');
