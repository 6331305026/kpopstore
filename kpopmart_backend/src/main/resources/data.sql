INSERT INTO USERS (USER_ID, USERNAME, PASSWORD) VALUES (1, 'user', 'user');

INSERT INTO BAND (BAND_ID, BAND_NAME) VALUES (1, 'Treasure');
INSERT INTO BAND (BAND_ID, BAND_NAME) VALUES (2, 'BlackPink');
INSERT INTO BAND (BAND_ID, BAND_NAME) VALUES (3, 'Big Bang');
INSERT INTO BAND (BAND_ID, BAND_NAME) VALUES (4, 'Winner');
INSERT INTO BAND (BAND_ID, BAND_NAME) VALUES (5, 'iKon');
INSERT INTO BAND (BAND_ID, BAND_NAME) VALUES (6, 'AKMU');
INSERT INTO BAND (BAND_ID, BAND_NAME) VALUES (7, 'Jeon Somi');

INSERT INTO PRODUCT (PRODUCT_ID, PRODUCT_PIC, PRODUCT_NAME, PRODUCT_DESC, PRODUCT_PRICE, BAND_ID) VALUES (1,'https://bit.ly/3ASus7u', 'TREASURE 2nd MINI ALBUM [THE SECOND STEP : CHAPTER TWO]', 'THE SECOND STEP: CHAPTER TWO will bring you closer to the global treasure maker with various expectations such as high participation of the members and energetic performances.','620', 1);
INSERT INTO PRODUCT (PRODUCT_ID, PRODUCT_PIC, PRODUCT_NAME, PRODUCT_DESC, PRODUCT_PRICE, BAND_ID) VALUES (2,'https://shorturl.at/HSY35', 'BLACKPINK 2nd ALBUM [BORN PINK] BOX SET ver', 'Package box , CD , Photobook,Envelope,Accordion lyrics paper ,Random large photocard (1 of 4) , Random postcard,Random  instant films, Random selfie photocard, Sticker,Poster (1ea / First Press Only )','690', 2);
INSERT INTO PRODUCT (PRODUCT_ID, PRODUCT_PIC, PRODUCT_NAME, PRODUCT_DESC, PRODUCT_PRICE, BAND_ID) VALUES (3,'https://shorturl.at/bdJO7', 'BLACKPINK 2nd VINYL LP [BORN PINK] -LIMITED EDITION-', 'Blackpink is a South Korean girl group formed by YG Entertainment, consisting of members Jisoo, Jennie, Rosé, and Lisa.','1,750', 2);
INSERT INTO PRODUCT (PRODUCT_ID, PRODUCT_PIC, PRODUCT_NAME, PRODUCT_DESC, PRODUCT_PRICE, BAND_ID) VALUES (4,'https://bit.ly/3AW9lRA', '(SET) [YG SELECT EDITION] WINNER 4th MINI ALBUM [HOLIDAY] (PHOTOBOOK ver.)', 'The winner is a South Korean boy band consisting of four members: Jinu, Hoony, Mino, and Seungyoon. The band was formed in 2013 by YG Entertainment through Mnets survival program WIN: Who Is Next leading','1,200', 3);
INSERT INTO PRODUCT (PRODUCT_ID, PRODUCT_PIC, PRODUCT_NAME, PRODUCT_DESC, PRODUCT_PRICE, BAND_ID) VALUES (5,'https://shorturl.at/bGPR6', 'TREASURE 2nd MINI ALBUM [THE SECOND STEP : CHAPTER TWO] (DIGIPACK ver.)', 'THE SECOND STEP: CHAPTER TWO will bring you closer to the global treasure maker with various expectations such as high participation of the members and energetic performances.','450', 1);
INSERT INTO PRODUCT (PRODUCT_ID, PRODUCT_PIC, PRODUCT_NAME, PRODUCT_DESC, PRODUCT_PRICE, BAND_ID) VALUES (6,'https://bit.ly/3inZ9LB', 'JEON SOMI THE FIRST ALBUM XOXO', 'Package box,Photobook,CD,Postcard, Mini note,Sticker set, Random pin button (1 of 2 ) + Random postcard (1 of 6) + Poster','690', 7);
INSERT INTO PRODUCT (PRODUCT_ID, PRODUCT_PIC, PRODUCT_NAME, PRODUCT_DESC, PRODUCT_PRICE, BAND_ID) VALUES (7,'https://bit.ly/3irEfef', 'iKON 4th MINI ALBUM [FLASHBACK] KiT ALBUM', 'iKon, stylized as iKON, is a South Korean boy band formed in 2015 by YG Entertainment, consisting of six members.','790', 5);
INSERT INTO PRODUCT (PRODUCT_ID, PRODUCT_PIC, PRODUCT_NAME, PRODUCT_DESC, PRODUCT_PRICE, BAND_ID) VALUES (8,'https://bit.ly/3ERWcuf', 'AKMU COLLABORATION ALBUM [NEXT EPISODE]', 'Pre Order Period / Pre-order period: 20 Jul - 26 Jul 2021 or until the product runs out. (Products may be out of stock before the sale date. because we have limited quota from YG)','450', 6);

INSERT INTO ORDERS (ORDER_ID, PRODUCT_ID, USER_ID) VALUES (1, 1, 1);