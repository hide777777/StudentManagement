-- 受講生（students）テーブル用のダミーデータ（5名）
-- id は AUTO_INCREMENT、deleted はデフォルト0なので省略しています

INSERT INTO students (name, kana_name, nickname, email, area, age, sex, remark, telephone) VALUES
  ('松本大地',   'マツモトダイチ',   'ダイチ', 'daichi@example.com',  '静岡', 26, '男性',   'Javaコース希望',   '090-2001-0001'),
  ('井上結衣',   'イノウエユイ',     'ユイ',   'yui@example.com',     '京都', 23, '女性',   '未経験から挑戦',   '090-2001-0002'),
  ('木村隆',     'キムラタカシ',     'タカ',   'takashi@example.com', '福岡', 38, '男性',   '週末に学習予定',   '090-2001-0003'),
  ('林愛',       'ハヤシアイ',       'アイ',   'ai@example.com',      '宮城', 31, '女性',   'AWSに興味あり',    '090-2001-0004'),
  ('清水陽',     'シミズヨウ',       'ヨウ',   'yo@example.com',      '沖縄', 20, 'その他', '学生・時間に余裕', '090-2001-0005');
