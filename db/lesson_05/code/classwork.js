

// CREATE
// db.animals.insertMany([
//   {kind: "tiger", weight: 300, name: "Alan", predatory: true},
//   {kind: "penguin", weight: 2, name: "Kovalsky", predatory: true},
//   {kind: "chicken", weight: 1, name: "Cipa", predatory: false},
//   {kind: "shark", weight: 400, name: "Sharp", predatory: false},
//   {kind: "shark", weight: 450, name: "John", predatory: false},
//   {kind: "panda", weight: 200, name: "Po", predatory: false},
// ]);

// UPDATE
// Операторы: $set, $inc, $rename, $push, $pull, $unset

// Изменим свойство predatory у акул - на true
// UPDATE MANY - обновит все документы соответсвующие фильтру
// первый filter - параметр поиска
// второй - сами изменения

// SET оператор
// изменил поле predatory у всех акул на true
// db.animals.updateMany({kind: "shark"}, {$set: {predatory:true}});

// INC - увеличивает значение на указанную величину
// увеличиваем вес всех животных на три
// db.animals.updateMany({}, {$inc: {weight: 3}});

// RENAME - переименовать имя свойства
// переименуем у всех животных weight в kg
// db.animals.updateMany({}, {$rename:{weight: "kg"}});

// UPDATE ONE - изменить одну запись - первый документ
// изменим имя конкретного объекта по ид
// db.animals.updateOne(
//   {_id: ObjectId("66575eeac76ba3e4e30398b8")},
//   {$set: {name: "Kovalsky 2"}}
// );
// db.animals.updateMany(
//     {predatory:true},
//     {$set: {foods: ["meat","fish"]}}
// );

// PUSH - добавить в массив

// db.animals.updateOne(
//     {kind:"tiger"},
//     {$push: {foods:"Tourists"}}
// );

// PULL - забрать из массива
// db.animals.updateOne(
//     {kind:"tiger"},
//     {$pull: {foods:"meat"}}
// );
// UNSET - убрать само свойство

// db.animals.updateOne(
//     {kind:"chicken"},
//     {$unset: {predatory:""}}
// );

// DELETE  - deleteOne, deleteMany
// один параметр - фильтр - кого желаем удалить
// удалим акулу по id

// db.animals.deleteOne({_id: ObjectId("66575eeac76ba3e4e30398bb")});

// добавим динозавра

// db.animals.insertOne({kind:"Dyno", kg:1500, name:"Danver"});

// Устроим вымирание динозаврам
// db.animals.deleteMany(
//     {kind: "Dyno"}
// );

// AGGREGATION
// pipeline -
// Основные стадии (этапы, stages) обработки - операторы
// $match фильтрация
// $sort сортировка
// -1 по убыванию
// 1 по возрастанию
// $project проекция
// $limit лимитирование
// $skip пропустить (документы)

// $sample получить произвольные документы
// $count возвращает ко-во документов

// получим всех хищных

// db.animals.aggregate([
//     {$match:{predatory:true}}
// ]);

// получим всех хищных и отсортируем по весу - от большего  к меньшему

// db.animals.aggregate(
//     {$match:{predatory:true}},
//     {$sort: {kg: -1}}
// );

// как получить самого тяжелого не хищника
// db.animals.aggregate(
//     {$match:{predatory:false}},
//     {$sort:{kg:-1}},
//     {$limit:1}
// );

// третий по тяжести хищник
// db.animals.aggregate([
//     {$match:{predatory:true}},
//     {$sort: {kg:-1}},
//     {$skip:2},
//     {$limit:1}
// ]);

// получим втрого и третьего по весу хищников

// db.animals.aggregate([
//     {$match:{predatory:true}},
//     {$sort: {kg:-1}},
//     {$skip: 1},
//     {$limit: 2}
// ]
// );

// получаем всех животных весом - 3 кг
// project - позволяет указать нужные поля
use("lection_05");

// db.animals.aggregate([
//       {$match: {kg: 403}},
//       {$project: {name: 1, foods: 1, _id: 0}}
//     ]);

// посчитать количество травоядных - мы указали alias -
// псеводним под которым вывести результат

// db.animals.aggregate([
//   {$match: {predatory: false}},
//   {$count: 'number_of_planteaters'}
// ]
// );

//получить случайное животное
// db.animals.aggregate([
//   {$sample: { size: 1, }, },
// ]);

// случайное животное весом больше 100 килограмм
// db.animals.aggregate([
//     {$match: {kg:{$gt:100}}},
//     {$sample: { size: 1, }, }
// ]);

// сколько тигров? без aggregate
// db.animals.countDocuments({kind: "tiger"});

// LOOKUP - $lookup
// используется для выполнения соединения (join) между коллекциями.
// Он позволяет объединять документы из двух коллекций на основе определенных условий.
// $lookup применяется в агрегационном конвейере и возвращает данные из связанной коллекции,
// добавляя их в результаты агрегации.

// добавили Пост (для примера захардкодили id)
// db.posts.insertOne({
//   _id: ObjectId("65c6096e0451b42a2273e13c"),
//   likes: 10,
//   text: "Hi, I am glad to be on likedin",
// });

// добавили комментарий к этому посту

// db.comments.insertOne([
//       {
//         email: "fish@mail.com",
//         message: "Oh, you are here! Wonderful!",
//         post_id: ObjectId("65c6096e0451b42a2273e13c"),
//       },
//       {
//         email: "eidelman@mail.com",
//         message: "Hey, man!",
//         post_id: ObjectId("65c6096e0451b42a2273e13c"),
//       },
//       {
//         email: "eidelman@mail.com",
//         message: "P.S. love you so!",
//         post_id: ObjectId("65c6096e0451b42a2273e13c"),
//       },
//     ]);


//     db.comments.aggregate([
//   {$lookup: {
//     from: "posts", // куда будем подсматривать - коллекция
//     localField: "post_id", // как называется в колл. комменте
//     foreignField: "_id",   // как называется в колл. посте
//     as: 'post_info'
//   }}
// ]);

// GROUP
// db.posts.insertMany([
//   {
//     likes: 10,
//     text: "Hi, I am glad to be on likedin",
//     category: "science",
//   },
//   {
//     likes: 2,
//     text: "Hi, I am glad to be on likedin",
//     category: "music",
//   },
//   {
//     likes: 3,
//     text: "Hi, I am glad to be on likedin",
//     category: "music",
//   },
// ]);