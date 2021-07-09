INSERT INTO tb_card VALUES ('fad4bb5d-7115-4347-b908-ef98b1449b93', 'itau', '255', '5471 5352 0267 0307', 'Matheus A Lima', '04/25');
INSERT INTO tb_card VALUES ('b1b985d9-a795-4b6a-b922-ae40736a6010', 'nubank', '255', '5471 5352 0267 0307', 'Lucas Albuquerque', '01/23');
INSERT INTO tb_card VALUES ('f04f99b3-329f-489d-b92e-8ce1b2926e5a', 'inter', '255', '5471 5352 0267 0307', 'João Victor Oliveira', '05/29');
COMMIT;

INSERT INTO tb_student VALUES ('c24118f2-178e-40d6-8602-a81d6ea44199', 22, null,  'computer science', 'matheus', 'ufpe', 'fad4bb5d-7115-4347-b908-ef98b1449b93');
INSERT INTO tb_student VALUES ('5ccfb291-99fb-456d-9e3d-2ebe7563443d', 22, null,  'computer science', 'lucas', 'ufpe', 'b1b985d9-a795-4b6a-b922-ae40736a6010');
INSERT INTO tb_student VALUES ('a4cec58a-7c65-4107-b2d4-c5910ced03b3', 22, null,  'computer science', 'jao', 'ufpe', 'f04f99b3-329f-489d-b92e-8ce1b2926e5a');
COMMIT;

INSERT INTO tb_payment VALUES ('c5821141-67c5-4f45-9d14-99b02d5bd6ca', 50, '2021-07-06T02:17:48.947Z', 'c24118f2-178e-40d6-8602-a81d6ea44199');
INSERT INTO tb_payment VALUES ('d9125e5b-718e-45fc-8db5-57721067fe1d', 50, '2021-07-05T02:17:48.947Z', '5ccfb291-99fb-456d-9e3d-2ebe7563443d');
INSERT INTO tb_payment VALUES ('e9ca976a1-c6e6-4870-8092-efb3fc4124b8', 50, '2021-07-09T02:17:48.947Z', 'a4cec58a-7c65-4107-b2d4-c5910ced03b3');