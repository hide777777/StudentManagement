-- 受講生（students）テーブル用のダミーデータ
-- id は AUTO_INCREMENT、deleted はデフォルト0なので省略しています

INSERT INTO students (name, kana_name, nickname, email, area, age, sex, remark, telephone) VALUES
  ('中村健太',   'ナカムラケンタ', 'ケン',   'kenta@example.com',   '神奈川', 27, '男性',   '夜間コース希望', '090-1234-0001'),
  ('小林さくら', 'コバヤシサクラ', 'サクラ', 'sakura@example.com',  '千葉',   24, '女性',   '',               '090-1234-0002'),
  ('加藤大輔',   'カトウダイスケ', 'ダイ',   'daisuke@example.com', '埼玉',   33, '男性',   '転職活動中',     '090-1234-0003'),
  ('吉田美咲',   'ヨシダミサキ',   'ミサ',   'misaki@example.com',  '兵庫',   29, '女性',   'AWSに興味あり',  '090-1234-0004'),
  ('山口翔',     'ヤマグチショウ', 'ショウ', 'sho@example.com',     '広島',   21, 'その他', '学生',           '090-1234-0005');
