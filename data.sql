-- --------------------------------------------------------
-- Máy chủ:                      127.0.0.1
-- Server version:               10.4.32-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Phiên bản:           12.6.0.6765
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- Dumping data for table elearning.answer: ~0 rows (approximately)
DELETE FROM `answer`;

-- Dumping data for table elearning.bill: ~17 rows (approximately)
DELETE FROM `bill`;
INSERT INTO `bill` (`created_date`, `status`, `course_id`, `user_id`, `payment_id`) VALUES
	('2001-09-19 08:23:58.082042', 0, 1, 3, 2),
	('1995-09-16 08:54:31.508840', 0, 1, 4, 1),
	('2000-05-24 02:18:49.662450', 0, 1, 5, 3),
	('1983-08-24 07:32:08.905670', 0, 1, 7, 3),
	('1966-09-27 00:42:26.895045', 0, 2, 3, 2),
	('1963-05-20 07:50:33.508910', 0, 2, 6, 1),
	('1978-03-23 10:38:15.565783', 0, 2, 7, 1),
	('1970-01-13 01:45:28.343316', 0, 3, 4, 2),
	('2001-04-20 09:49:44.254670', 0, 3, 6, 3),
	('2001-12-10 05:35:23.012772', 0, 3, 7, 2),
	('1968-09-13 09:15:34.229703', 0, 4, 7, 2),
	('1986-11-25 03:12:52.527887', 0, 5, 4, 1),
	('1984-03-15 23:12:29.773714', 0, 5, 5, 3),
	('1987-01-29 20:56:28.712626', 0, 6, 3, 3),
	('1979-02-10 20:22:34.408068', 0, 6, 5, 2),
	('1983-02-14 14:14:33.140856', 0, 6, 7, 3),
	('2004-04-29 00:59:29.994236', 0, 7, 3, 2);

-- Dumping data for table elearning.category: ~5 rows (approximately)
DELETE FROM `category`;
INSERT INTO `category` (`category_id`, `image`, `name`) VALUES
	(1, 'https://res.cloudinary.com/dx0blzlhd/image/upload/v1732006921/appELearning/trend-up_o24cjx.png', 'Business'),
	(2, 'https://res.cloudinary.com/dx0blzlhd/image/upload/v1732006915/appELearning/coding_yzkoqa.png', 'Code'),
	(3, 'https://res.cloudinary.com/dx0blzlhd/image/upload/v1732006915/appELearning/cam-recorder_mf0l4t.png', 'Movie'),
	(4, 'https://res.cloudinary.com/dx0blzlhd/image/upload/v1732006916/appELearning/pen_yaszeu.png', 'Design'),
	(5, 'https://res.cloudinary.com/dx0blzlhd/image/upload/v1732006915/appELearning/earth_cb0v9r.png', 'Language');

-- Dumping data for table elearning.course: ~7 rows (approximately)
DELETE FROM `course`;
INSERT INTO `course` (`course_id`, `created_at`, `description`, `image`, `price`, `rating`, `status`, `title`, `category_id`, `user_id`) VALUES
	(1, '1976-04-03 03:38:40.736877', 'Necessitatibus consectetur cumque. Tenetur hic cumque aliquam. Cumque perspiciatis tempore doloribus laboriosam eos commodi voluptatum.', NULL, 43.26, '4.0', 0, 'Little Hands Clapping', 1, 1),
	(2, '1980-08-13 21:08:15.879649', 'Veritatis porro sapiente voluptatum possimus ab ab recusandae. Alias harum illum magni aliquam labore aut. Expedita ipsum doloribus. Inventore asperiores rerum ex sed unde assumenda. Facilis itaque dolor.', NULL, 51.34, '1.0', 0, 'A Glass of Blessings', 2, 1),
	(3, '1962-09-12 17:07:17.428815', 'Dolorum nostrum numquam consectetur dolores. Ullam veritatis odio. Error veniam corrupti officiis. Animi ducimus autem libero.', NULL, 36.35, '1.0', 1, 'The Widening Gyre', 2, 1),
	(4, '1972-03-01 16:59:19.879128', 'Laudantium blanditiis saepe corporis debitis sint et. Qui vero dolor iste. Itaque nesciunt tenetur nesciunt. Ullam repellendus dolorem nostrum dolore qui esse laudantium. Consequuntur nulla consectetur sed velit nemo vel.', NULL, 31.39, '2.0', 2, 'Noli Me Tangere', 4, 1),
	(5, '1978-01-01 09:47:58.794896', 'Dignissimos nesciunt dolorum voluptate. Explicabo veritatis dolorem eius voluptates voluptate. Dolores deleniti distinctio est. Voluptas repellendus quae. Esse omnis libero.', NULL, 95.06, '1.0', 1, 'The Road Less Traveled', 3, 1),
	(6, '1970-12-17 20:26:58.963067', 'Tempore sunt est mollitia. Rem dolore deleniti. Aliquam eius enim debitis officiis quibusdam.', NULL, 62.49, '2.0', 0, 'Postern of Fate', 1, 1),
	(7, '2002-01-03 11:07:56.685883', 'Quaerat earum quis. Eos quidem aspernatur culpa tempore autem assumenda. Suscipit error minus laudantium. Dolore fuga dolores iusto placeat.', NULL, 63.63, '2.0', 1, 'Ah, Wilderness!', 5, 1);

-- Dumping data for table elearning.enroll_course: ~17 rows (approximately)
DELETE FROM `enroll_course`;
INSERT INTO `enroll_course` (`completed_date`, `enrolled_date`, `progress`, `course_id`, `user_id`) VALUES
	('2001-12-02 08:23:58.082042', '2001-09-19 08:23:58.082042', 100, 1, 3),
	(NULL, '1995-09-16 08:54:31.508840', 95, 1, 4),
	(NULL, '2000-05-24 02:18:49.662450', 53, 1, 5),
	(NULL, '1983-08-24 07:32:08.905670', 12, 1, 7),
	(NULL, '1966-09-27 00:42:26.895045', 14, 2, 3),
	('1963-08-14 07:50:33.508910', '1963-05-20 07:50:33.508910', 100, 2, 6),
	('1978-06-05 10:38:15.565783', '1978-03-23 10:38:15.565783', 100, 2, 7),
	('1970-02-28 01:45:28.343316', '1970-01-13 01:45:28.343316', 100, 3, 4),
	(NULL, '2001-04-20 09:49:44.254670', 48, 3, 6),
	('2002-02-14 05:35:23.012772', '2001-12-10 05:35:23.012772', 100, 3, 7),
	('1968-12-02 09:15:34.229703', '1968-09-13 09:15:34.229703', 100, 4, 7),
	(NULL, '1986-11-25 03:12:52.527887', 68, 5, 4),
	('1984-04-27 23:12:29.773714', '1984-03-15 23:12:29.773714', 100, 5, 5),
	('1987-04-17 20:56:28.712626', '1987-01-29 20:56:28.712626', 100, 6, 3),
	('1979-03-23 20:22:34.408068', '1979-02-10 20:22:34.408068', 100, 6, 5),
	(NULL, '1983-02-14 14:14:33.140856', 81, 6, 7),
	(NULL, '2004-04-29 00:59:29.994236', 5, 7, 3);

-- Dumping data for table elearning.feedback: ~0 rows (approximately)
DELETE FROM `feedback`;

-- Dumping data for table elearning.lesson: ~100 rows (approximately)
DELETE FROM `lesson`;
INSERT INTO `lesson` (`lesson_id`, `lesson_number`, `time`, `title`, `url`, `view`, `section_id`) VALUES
	(1, 1, '16:44', 'Master of Health Science', 'https://www.foster-sauer.io:50918/', 228, 1),
	(2, 2, '36:46', 'Bachelor of Health Science', 'http://www.mafalda-skiles.biz/?alias=id&incidunt=itaque#ut', 454, 1),
	(3, 3, '34:44', 'Master of Forensic Science', 'https://www.jewel-ritchie.com:56671/', 276, 1),
	(4, 1, '28:25', 'Associate Degree in Creative Arts', 'http://www.breanna-kunze.net:64860/nisi', 235, 2),
	(5, 2, '22:16', 'Associate Degree in Engineering', 'https://www.brooks-kohler.net/', 186, 2),
	(6, 3, '10:30', 'Bachelor of Computer Science', 'https://www.jodi-hahn.name/#quas', 102, 2),
	(7, 4, '24:35', 'Associate Degree in Criminology', 'https://www.olin-kunde.co:53539/?impedit=officiis&vitae=nisi#quod', 28, 2),
	(8, 5, '38:47', 'Associate Degree in Biomedical Science', 'https://www.marty-bartoletti.info/?voluptates=consequatur&impedit=nulla', 685, 2),
	(9, 1, '13:12', 'Bachelor of Education', 'https://www.alyssa-barton.org/ipsum#magni', 253, 3),
	(10, 2, '37:48', 'Master of Design', 'https://www.elvin-price.co:18334/sapiente/facilisquisquam?quisquam=odit&optio=debitis', 552, 3),
	(11, 3, '12:22', 'Associate Degree in Biomedical Science', 'http://www.pasquale-nitzsche.org/#necessitatibus', 803, 3),
	(12, 1, '30:55', 'Associate Degree in Teaching', 'https://www.randee-koelpin.info/et?neque=est&enim=officiis#cum', 327, 4),
	(13, 2, '39:8', 'Master of Architectural Technology', 'https://www.rocio-bernier.net:4073/?aperiam=saepe&numquam=a#rerum', 629, 4),
	(14, 3, '16:30', 'Master of Creative Arts', 'http://www.cesar-shanahan.biz:6860/necessitatibus?commodi=corrupti&nulla=aliquam', 48, 4),
	(15, 4, '10:28', 'Master of Design', 'https://www.alberta-considine.info/#eius', 26, 4),
	(16, 1, '19:25', 'Master of Biomedical Science', 'https://www.isiah-fahey.name/voluptatem/optionon#labore', 66, 5),
	(17, 2, '38:49', 'Bachelor of Design', 'http://www.ira-simonis.com/autem/quiaiste?esse=provident&inventore=eos#odit', 253, 5),
	(18, 3, '15:50', 'Bachelor of Law', 'https://www.vita-abshire.info/', 781, 5),
	(19, 4, '18:30', 'Associate Degree in Psychology', 'https://www.nicolas-mills.name:50220/cum/quidemvel', 337, 5),
	(20, 1, '20:15', 'Master of Applied Science (Psychology)', 'https://www.leonie-towne.name/culpa/optiofuga', 359, 6),
	(21, 2, '22:46', 'Bachelor of Arts', 'https://www.patrice-orn.info:40269/#eius', 173, 6),
	(22, 3, '26:45', 'Bachelor of Computer Science', 'https://www.teddy-haag.net/quaerat?debitis=quam&corrupti=quas', 134, 6),
	(23, 4, '11:40', 'Master of Creative Arts', 'https://www.otis-west.biz/quidem/explicabo#repellendus', 647, 6),
	(24, 5, '23:22', 'Master of Creative Arts', 'https://www.charita-hansen.com/culpa/debitisprovident#recusandae', 944, 6),
	(25, 1, '31:4', 'Bachelor of Biomedical Science', 'https://www.bobby-waelchi.info:19059/animi?illo=quas&rerum=quaerat', 194, 7),
	(26, 2, '28:57', 'Associate Degree in Computer Science', 'https://www.franklin-legros.info:9802/aut?neque=nulla&ea=alias', 216, 7),
	(27, 3, '14:28', 'Associate Degree in Teaching', 'http://www.paul-corkery.name:21620/in/omnis?sunt=eligendi&odio=optio#placeat', 546, 7),
	(28, 1, '36:25', 'Associate Degree in Commerce', 'https://www.bryce-wisozk.co/quia/atvoluptatem?error=deserunt&expedita=quos', 469, 8),
	(29, 2, '25:37', 'Master of Computer Science', 'https://www.amos-oconner.co:7417/at/totamvoluptates?corrupti=tempora&eligendi=exercitationem#repudiandae', 77, 8),
	(30, 3, '24:56', 'Associate Degree in Health Science', 'http://www.vernon-armstrong.io:22727/odit', 57, 8),
	(31, 1, '19:43', 'Master of Information Systems', 'https://www.eddy-gusikowski.io:1447/voluptas/similiquedistinctio#ea', 624, 9),
	(32, 2, '13:16', 'Bachelor of Education', 'http://www.un-klein.co:42331/delectus?maxime=itaque&numquam=alias', 343, 9),
	(33, 3, '10:26', 'Master of Criminology', 'https://www.edison-oconner.name:24525/earum/dolorum', 208, 9),
	(34, 4, '38:44', 'Master of Education', 'http://www.cris-morar.name:21099/?sapiente=quisquam&placeat=excepturi#eius', 599, 9),
	(35, 5, '19:23', 'Master of Computer Science', 'http://www.gracia-kessler.name/vero/blanditiisrecusandae?dolore=distinctio&deleniti=vel#harum', 217, 9),
	(36, 1, '25:34', 'Master of Applied Science (Psychology)', 'https://www.leola-buckridge.biz:43698/atque/quodreiciendis?modi=incidunt&labore=delectus#alias', 416, 10),
	(37, 2, '27:46', 'Master of Criminology', 'https://www.herschel-emmerich.info/#exercitationem', 811, 10),
	(38, 3, '17:20', 'Master of Biomedical Science', 'https://www.terrie-littel.info/?nobis=consectetur&facere=exercitationem#cupiditate', 244, 10),
	(39, 1, '17:56', 'Associate Degree in Medicine', 'https://www.marcelino-jones.biz:9489/consequatur/quaerat?nobis=adipisci&omnis=dolore#minima', 764, 11),
	(40, 2, '29:51', 'Master of Architectural Technology', 'https://www.dylan-goyette.biz:24784/quos/quaeratvero', 148, 11),
	(41, 3, '29:16', 'Bachelor of Engineering', 'https://www.salina-borer.org/?commodi=enim&amet=sed#adipisci', 442, 11),
	(42, 4, '14:15', 'Associate Degree in Engineering', 'https://www.heriberto-hane.info:48278/#quas', 412, 11),
	(43, 1, '24:57', 'Master of Biological Science', 'https://www.quincy-towne.info/#veritatis', 914, 12),
	(44, 2, '24:55', 'Master of Engineering', 'http://www.jessika-stiedemann.org/?est=mollitia&consequuntur=molestias', 351, 12),
	(45, 3, '13:2', 'Bachelor of Teaching', 'https://www.gregg-flatley.net:62573/accusamus/commodi#illum', 646, 12),
	(46, 4, '13:41', 'Associate Degree in Education', 'https://www.margurite-pouros.net:865/', 212, 12),
	(47, 1, '21:53', 'Associate Degree in Commerce', 'https://www.magnolia-farrell.net/', 292, 13),
	(48, 2, '16:54', 'Master of Biological Science', 'https://www.annetta-renner.name:40608/fugiat?labore=occaecati&recusandae=aliquam', 299, 13),
	(49, 3, '21:7', 'Bachelor of Law', 'http://www.victor-mante.org/consequatur/undecumque?velit=ab&doloribus=maxime#facere', 524, 13),
	(50, 1, '34:43', 'Bachelor of Teaching', 'https://www.sana-nienow.org/nulla/culpa#dolores', 723, 14),
	(51, 2, '15:44', 'Bachelor of Criminology', 'http://www.jae-brekke.name/error/doloremillo#laborum', 784, 14),
	(52, 3, '10:30', 'Master of Psychology', 'https://www.ramiro-moen.info/?atque=illo&perspiciatis=dolore', 961, 14),
	(53, 4, '17:11', 'Master of Biomedical Science', 'https://www.harold-wilderman.net:58920/voluptas#exercitationem', 635, 14),
	(54, 1, '35:4', 'Associate Degree in Psychology', 'http://www.alphonse-rowe.net:10717/#tempora', 941, 15),
	(55, 2, '27:37', 'Master of Forensic Science', 'http://www.hank-gerhold.io/qui/minuspossimus?ducimus=autem&labore=voluptates#sit', 900, 15),
	(56, 3, '10:4', 'Master of Education', 'https://www.kasie-streich.net:2808/temporibus/laudantium?sequi=impedit&reprehenderit=quae', 532, 15),
	(57, 1, '39:42', 'Associate Degree in Business', 'https://www.penny-upton.info:29863/', 308, 16),
	(58, 2, '23:29', 'Bachelor of Arts', 'http://www.arlie-kuhlman.io:21558/#et', 340, 16),
	(59, 3, '36:31', 'Master of Design', 'https://www.opal-beatty.com:62795/#asperiores', 913, 16),
	(60, 4, '31:10', 'Associate Degree in Education', 'http://www.ligia-keeling.info/#deserunt', 752, 16),
	(61, 1, '37:41', 'Associate Degree in Law', 'https://www.grady-streich.net:45528/cumque/cumque?labore=eum&officia=eligendi', 945, 17),
	(62, 2, '30:12', 'Bachelor of Design', 'https://www.sacha-streich.io/aspernatur/cumque#molestias', 516, 17),
	(63, 3, '10:50', 'Master of Creative Arts', 'https://www.noe-schimmel.net:1259/?nisi=pariatur&cum=magni#beatae', 581, 17),
	(64, 1, '36:53', 'Bachelor of Engineering', 'https://www.austin-kshlerin.biz/?sapiente=ex&iure=similique', 757, 18),
	(65, 2, '19:30', 'Bachelor of Medicine', 'https://www.josiah-bode.com/eum/accusamuscumque?quasi=aliquam&vero=quod#temporibus', 726, 18),
	(66, 3, '19:22', 'Master of Business', 'https://www.majorie-beer.co:29309/error/voluptaslaborum', 219, 18),
	(67, 1, '16:53', 'Master of Applied Science (Psychology)', 'https://www.vesta-abernathy.io/officiis/laudantium', 299, 19),
	(68, 2, '20:48', 'Master of Communications', 'https://www.rosena-hackett.info:43891/et', 480, 19),
	(69, 3, '30:12', 'Associate Degree in Business', 'https://www.chauncey-wilkinson.name/atque/sedtempora', 382, 19),
	(70, 1, '17:15', 'Associate Degree in Psychology', 'https://www.romeo-ziemann.info/#libero', 940, 20),
	(71, 2, '28:57', 'Master of Information Systems', 'https://www.edgardo-mclaughlin.biz/dignissimos?earum=incidunt&maiores=eaque#voluptatibus', 771, 20),
	(72, 3, '28:35', 'Bachelor of Information Systems', 'https://www.india-gaylord.org:39104/', 95, 20),
	(73, 1, '21:41', 'Bachelor of Criminology', 'https://www.jesse-schowalter.info/?ipsum=quis&tempora=nostrum#necessitatibus', 184, 21),
	(74, 2, '37:49', 'Associate Degree in Biological Science', 'https://www.keena-pouros.info:44910/doloribus/eos#incidunt', 680, 21),
	(75, 3, '39:6', 'Master of Architectural Technology', 'https://www.letty-okeefe.org/culpa/repellatdolorum', 183, 21),
	(76, 1, '12:16', 'Associate Degree in Information Systems', 'https://www.lawerence-emmerich.io:30591/deserunt', 453, 22),
	(77, 2, '18:32', 'Bachelor of Business', 'https://www.bert-white.org/assumenda', 875, 22),
	(78, 3, '34:11', 'Associate Degree in Nursing', 'http://www.maybelle-thompson.biz/quidem#quisquam', 245, 22),
	(79, 4, '12:11', 'Bachelor of Computer Science', 'https://www.ayana-cummings.net:32548/necessitatibus/officia?sequi=asperiores&dignissimos=sequi#consectetur', 220, 22),
	(80, 5, '39:34', 'Bachelor of Health Science', 'https://www.valerie-stoltenberg.name/sequi/nam', 362, 22),
	(81, 1, '39:29', 'Master of Biological Science', 'http://www.william-vandervort.biz/atque/iste', 526, 23),
	(82, 2, '11:15', 'Bachelor of Creative Arts', 'https://www.tonisha-sporer.org:22281/impedit?autem=quasi&dignissimos=sed', 153, 23),
	(83, 3, '17:6', 'Master of Architectural Technology', 'https://www.leonardo-thompson.co:2888/odit', 577, 23),
	(84, 4, '26:25', 'Associate Degree in Business', 'https://www.brice-pagac.net/porro/veniamneque?tempore=minima&vitae=molestias#reiciendis', 373, 23),
	(85, 5, '19:16', 'Bachelor of Education', 'https://www.sammy-cruickshank.com/fugit/aspernatur#perspiciatis', 13, 23),
	(86, 1, '12:43', 'Bachelor of Engineering', 'https://www.breanna-bergnaum.org:30166/#officia', 130, 24),
	(87, 2, '28:58', 'Associate Degree in Computer Science', 'https://www.renaldo-lehner.co:29381/est#a', 193, 24),
	(88, 3, '22:37', 'Master of Law', 'https://www.bernardina-reynolds.org:34948/consequatur?adipisci=cum&sunt=iure', 116, 24),
	(89, 4, '14:13', 'Bachelor of Education', 'https://www.keenan-graham.org/dolore/aspernatur', 46, 24),
	(90, 1, '20:59', 'Master of Computer Science', 'https://www.emory-watsica.io:57872/?quibusdam=soluta&voluptates=recusandae', 517, 25),
	(91, 2, '31:50', 'Master of Computer Science', 'https://www.stefany-block.io/', 66, 25),
	(92, 3, '30:15', 'Associate Degree in Architectural Technology', 'http://www.luisa-legros.info:10084/', 681, 25),
	(93, 4, '37:45', 'Bachelor of Biomedical Science', 'https://www.collin-mohr.net:42924/repudiandae', 573, 25),
	(94, 1, '36:42', 'Associate Degree in Design', 'https://www.edmond-daniel.biz/dignissimos/faceredicta?dolorem=blanditiis&alias=nobis#ex', 717, 26),
	(95, 2, '19:30', 'Bachelor of Commerce', 'https://www.wilton-lowe.org:43405/vero/magni?labore=ipsum&porro=molestias', 568, 26),
	(96, 3, '33:40', 'Bachelor of Health Science', 'https://www.delpha-hyatt.org/inventore/possimusdistinctio?nisi=sequi&nam=laboriosam', 227, 26),
	(97, 4, '14:26', 'Associate Degree in Psychology', 'https://www.leonor-price.name:25605/voluptas/quod#officiis', 848, 26),
	(98, 1, '33:18', 'Master of Health Science', 'http://www.jill-daniel.net/?officia=odit&sequi=eum#eligendi', 579, 27),
	(99, 2, '22:52', 'Associate Degree in Engineering', 'https://www.garret-wunsch.info/dolorem/iurerepellendus', 266, 27),
	(100, 3, '39:53', 'Associate Degree in Health Science', 'https://www.alphonso-crona.co/earum?laborum=commodi&odit=eaque#occaecati', 367, 27);

-- Dumping data for table elearning.lesson_user: ~252 rows (approximately)
DELETE FROM `lesson_user`;
INSERT INTO `lesson_user` (`status`, `student_id`, `lesson_id`) VALUES
	(1, 3, 1),
	(1, 4, 1),
	(1, 5, 1),
	(0, 7, 1),
	(1, 3, 2),
	(1, 4, 2),
	(0, 5, 2),
	(0, 7, 2),
	(1, 3, 3),
	(0, 4, 3),
	(0, 5, 3),
	(0, 7, 3),
	(1, 3, 4),
	(1, 4, 4),
	(1, 5, 4),
	(0, 7, 4),
	(1, 3, 5),
	(1, 4, 5),
	(1, 5, 5),
	(0, 7, 5),
	(1, 3, 6),
	(1, 4, 6),
	(0, 5, 6),
	(0, 7, 6),
	(1, 3, 7),
	(1, 4, 7),
	(0, 5, 7),
	(0, 7, 7),
	(1, 3, 8),
	(0, 4, 8),
	(0, 5, 8),
	(0, 7, 8),
	(1, 3, 9),
	(1, 4, 9),
	(1, 5, 9),
	(0, 7, 9),
	(1, 3, 10),
	(1, 4, 10),
	(0, 5, 10),
	(0, 7, 10),
	(1, 3, 11),
	(0, 4, 11),
	(0, 5, 11),
	(0, 7, 11),
	(1, 3, 12),
	(1, 4, 12),
	(1, 5, 12),
	(0, 7, 12),
	(1, 3, 13),
	(1, 4, 13),
	(1, 5, 13),
	(0, 7, 13),
	(1, 3, 14),
	(1, 4, 14),
	(0, 5, 14),
	(0, 7, 14),
	(1, 3, 15),
	(0, 4, 15),
	(0, 5, 15),
	(0, 7, 15),
	(0, 3, 16),
	(1, 6, 16),
	(1, 7, 16),
	(0, 3, 17),
	(1, 6, 17),
	(1, 7, 17),
	(0, 3, 18),
	(1, 6, 18),
	(1, 7, 18),
	(0, 3, 19),
	(1, 6, 19),
	(1, 7, 19),
	(0, 3, 20),
	(1, 6, 20),
	(1, 7, 20),
	(0, 3, 21),
	(1, 6, 21),
	(1, 7, 21),
	(0, 3, 22),
	(1, 6, 22),
	(1, 7, 22),
	(0, 3, 23),
	(1, 6, 23),
	(1, 7, 23),
	(0, 3, 24),
	(1, 6, 24),
	(1, 7, 24),
	(0, 3, 25),
	(1, 6, 25),
	(1, 7, 25),
	(0, 3, 26),
	(1, 6, 26),
	(1, 7, 26),
	(0, 3, 27),
	(1, 6, 27),
	(1, 7, 27),
	(0, 3, 28),
	(1, 6, 28),
	(1, 7, 28),
	(0, 3, 29),
	(1, 6, 29),
	(1, 7, 29),
	(0, 3, 30),
	(1, 6, 30),
	(1, 7, 30),
	(1, 4, 31),
	(1, 6, 31),
	(1, 7, 31),
	(1, 4, 32),
	(1, 6, 32),
	(1, 7, 32),
	(1, 4, 33),
	(0, 6, 33),
	(1, 7, 33),
	(1, 4, 34),
	(0, 6, 34),
	(1, 7, 34),
	(1, 4, 35),
	(0, 6, 35),
	(1, 7, 35),
	(1, 4, 36),
	(1, 6, 36),
	(1, 7, 36),
	(1, 4, 37),
	(0, 6, 37),
	(1, 7, 37),
	(1, 4, 38),
	(0, 6, 38),
	(1, 7, 38),
	(1, 4, 39),
	(1, 6, 39),
	(1, 7, 39),
	(1, 4, 40),
	(0, 6, 40),
	(1, 7, 40),
	(1, 4, 41),
	(0, 6, 41),
	(1, 7, 41),
	(1, 4, 42),
	(0, 6, 42),
	(1, 7, 42),
	(1, 4, 43),
	(1, 6, 43),
	(1, 7, 43),
	(1, 4, 44),
	(0, 6, 44),
	(1, 7, 44),
	(1, 4, 45),
	(0, 6, 45),
	(1, 7, 45),
	(1, 4, 46),
	(0, 6, 46),
	(1, 7, 46),
	(1, 7, 47),
	(1, 7, 48),
	(1, 7, 49),
	(1, 7, 50),
	(1, 7, 51),
	(1, 7, 52),
	(1, 7, 53),
	(1, 7, 54),
	(1, 7, 55),
	(1, 7, 56),
	(1, 4, 57),
	(1, 5, 57),
	(1, 4, 58),
	(1, 5, 58),
	(0, 4, 59),
	(1, 5, 59),
	(0, 4, 60),
	(1, 5, 60),
	(1, 4, 61),
	(1, 5, 61),
	(1, 4, 62),
	(1, 5, 62),
	(0, 4, 63),
	(1, 5, 63),
	(1, 4, 64),
	(1, 5, 64),
	(1, 4, 65),
	(1, 5, 65),
	(0, 4, 66),
	(1, 5, 66),
	(1, 4, 67),
	(1, 5, 67),
	(1, 4, 68),
	(1, 5, 68),
	(0, 4, 69),
	(1, 5, 69),
	(1, 3, 70),
	(1, 5, 70),
	(1, 7, 70),
	(1, 3, 71),
	(1, 5, 71),
	(1, 7, 71),
	(1, 3, 72),
	(1, 5, 72),
	(0, 7, 72),
	(1, 3, 73),
	(1, 5, 73),
	(1, 7, 73),
	(1, 3, 74),
	(1, 5, 74),
	(1, 7, 74),
	(1, 3, 75),
	(1, 5, 75),
	(0, 7, 75),
	(1, 3, 76),
	(1, 5, 76),
	(1, 7, 76),
	(1, 3, 77),
	(1, 5, 77),
	(1, 7, 77),
	(1, 3, 78),
	(1, 5, 78),
	(1, 7, 78),
	(1, 3, 79),
	(1, 5, 79),
	(1, 7, 79),
	(1, 3, 80),
	(1, 5, 80),
	(0, 7, 80),
	(1, 3, 81),
	(1, 5, 81),
	(1, 7, 81),
	(1, 3, 82),
	(1, 5, 82),
	(1, 7, 82),
	(1, 3, 83),
	(1, 5, 83),
	(1, 7, 83),
	(1, 3, 84),
	(1, 5, 84),
	(1, 7, 84),
	(1, 3, 85),
	(1, 5, 85),
	(0, 7, 85),
	(0, 3, 86),
	(0, 3, 87),
	(0, 3, 88),
	(0, 3, 89),
	(0, 3, 90),
	(0, 3, 91),
	(0, 3, 92),
	(0, 3, 93),
	(0, 3, 94),
	(0, 3, 95),
	(0, 3, 96),
	(0, 3, 97),
	(0, 3, 98),
	(0, 3, 99),
	(0, 3, 100);

-- Dumping data for table elearning.payment: ~4 rows (approximately)
DELETE FROM `payment`;
INSERT INTO `payment` (`payment_id`, `image`, `payment_name`) VALUES
	(1, 'https://res.cloudinary.com/dx0blzlhd/image/upload/v1732006951/appELearning/pay-pal_dbetsw.png', 'Paypal'),
	(2, 'https://res.cloudinary.com/dx0blzlhd/image/upload/v1732006950/appELearning/google-pay_olyauw.png', 'Google Pay'),
	(3, 'https://res.cloudinary.com/dx0blzlhd/image/upload/v1732006949/appELearning/apple-pay_xbrut5.png', 'Apple Pay'),
	(4, 'https://res.cloudinary.com/dx0blzlhd/image/upload/v1732006950/appELearning/credit-card_bd6lfb.png', 'atm');

-- Dumping data for table elearning.question: ~0 rows (approximately)bill
DELETE FROM `question`;

-- Dumping data for table elearning.section: ~27 rows (approximately)
DELETE FROM `section`;
INSERT INTO `section` (`section_id`, `section_number`, `title`, `course_id`) VALUES
	(1, 1, 'Expedita minus eligendi quod tenetur veniam porro alias.', 1),
	(2, 2, 'Soluta cum quos.', 1),
	(3, 3, 'Quas suscipit asperiores voluptatibus officiis vitae.', 1),
	(4, 4, 'Quas officiis quia.', 1),
	(5, 1, 'Ea quis reprehenderit veniam maxime dolorem quidem.', 2),
	(6, 2, 'Nam debitis totam assumenda officiis quisquam commodi.', 2),
	(7, 3, 'Eos aperiam ab quae.', 2),
	(8, 4, 'Sint quidem occaecati illum enim.', 2),
	(9, 1, 'Dicta dicta ea est totam eveniet.', 3),
	(10, 2, 'Odio id fugit commodi vero.', 3),
	(11, 3, 'Labore eveniet voluptatem labore maxime quis cupiditate molestiae.', 3),
	(12, 4, 'Voluptatum corrupti ad quae.', 3),
	(13, 1, 'Atque aut quidem at distinctio soluta neque.', 4),
	(14, 2, 'Ad rerum minus vero.', 4),
	(15, 3, 'Doloribus dicta cupiditate temporibus dignissimos sint natus reiciendis.', 4),
	(16, 1, 'At incidunt ad eius provident ullam voluptates aperiam.', 5),
	(17, 2, 'Autem repudiandae aperiam.', 5),
	(18, 3, 'Deleniti unde explicabo consectetur id dolore.', 5),
	(19, 4, 'Eos et voluptas ex assumenda.', 5),
	(20, 1, 'Quidem culpa quae accusamus minima ad.', 6),
	(21, 2, 'Dolorem aliquid optio nobis.', 6),
	(22, 3, 'Maiores fugit aperiam iusto voluptatem recusandae sed.', 6),
	(23, 4, 'Mollitia vel architecto quibusdam omnis quaerat.', 6),
	(24, 1, 'Voluptatem incidunt modi facilis ipsum voluptatem molestiae pariatur.', 7),
	(25, 2, 'Numquam quae debitis sed doloribus voluptas.', 7),
	(26, 3, 'Eos odio eos distinctio accusantium.', 7),
	(27, 4, 'Mollitia labore qui recusandae quibusdam ipsam sunt deserunt.', 7);

-- Dumping data for table elearning.student: ~5 rows (approximately)
DELETE FROM `student`;
INSERT INTO `student` (`grade`, `school`, `user_id`) VALUES
	('University', 'Flowerlake TAFE', 3),
	('University', 'Bluemeadow TAFE', 4),
	('University', 'Clearcourt University', 5),
	('University', 'Vertapple Technical College', 6),
	('University', 'Lakeacre College', 7);

-- Dumping data for table elearning.teacher: ~2 rows (approximately)
DELETE FROM `teacher`;
INSERT INTO `teacher` (`experience`, `school`, `user_id`) VALUES
	(8, 'Ironbarrow Technical College', 1),
	(6, 'Marblewald College', 2);

-- Dumping data for table elearning.user: ~7 rows (approximately)
DELETE FROM `user`;
INSERT INTO `user` (`user_id`, `avatar`, `description`, `email`, `name`, `password`) VALUES
	(1, 'https://robohash.org/cfptpitf.png', 'Nisi expedita molestiae temporibus architecto explicabo blanditiis.', 'concetta.thompson@hotmail.com', 'Enoch Volkman V', '3yrfnq6bsd31'),
	(2, 'https://robohash.org/qirxdnsu.png', 'Libero nisi expedita eveniet omnis rem repellendus.', 'danny.koelpin@gmail.com', 'Paul Flatley', '9535y760w355bv5u'),
	(3, 'https://robohash.org/pxmmanrj.png', 'Mollitia corporis iusto.', 'marketta.hodkiewicz@yahoo.com', 'Johana Mills', 'nw6ot462e'),
	(4, 'https://robohash.org/fzdpntqi.png', 'Reprehenderit reprehenderit voluptatem.', 'niki.west@yahoo.com', 'Eleonore Treutel', '92jr8939ik'),
	(5, 'https://robohash.org/rfpqomwu.png', 'Laborum nam numquam.', 'julius.bogisich@hotmail.com', 'Jacquelyne Prosacco', 'p7dft9625'),
	(6, 'https://robohash.org/sfsomtpq.png', 'Accusantium ducimus voluptatibus sed.', 'brigida.swaniawski@hotmail.com', 'Jodie Kuhic', 'vo0eu67s'),
	(7, 'https://robohash.org/ouwtbocr.png', 'Corporis molestiae libero similique commodi reprehenderit ad.', 'jeanice.koepp@yahoo.com', 'Eddy Quigley', '31658lj3p35cms');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
