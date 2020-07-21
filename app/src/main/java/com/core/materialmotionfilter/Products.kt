package com.core.materialmotionfilter

data class Products (
    val id : Int?,
    val title : String?,
    val subTitle : String?,
    val offerPrice : String?,
    val actualPrice : String?,
    val image : String?
)

val product1 = Products(
    id = 1,
    title = "Da Milano",
    subTitle = "Height: 33.02 cm Width: 40.6 cm Depth: 10.1 cm",
    offerPrice = "₹9500",
    actualPrice = "₹ 10500",
    image = "https://images.pexels.com/photos/1152077/pexels-photo-1152077.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
)

val product2 = Products(
    id = 2,
    title = "Tommy Hilfiger",
    subTitle = "Matt Black solid quilted jacket, has a mock collar, 2 pockets, zip closure, polyester lining",
    offerPrice = "₹4599",
    actualPrice = "₹ 6000",
    image = "https://images.pexels.com/photos/4514348/pexels-photo-4514348.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
)

val product3 = Products(
    id = 3,
    title = "GANT",
    subTitle = "The model (height 6') is wearing a size M",
    offerPrice = "₹8000",
    actualPrice = "₹ 9500",
    image = "https://images.pexels.com/photos/991509/pexels-photo-991509.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
)

val product4 = Products(
    id = 4,
    title = "Oculus Quest",
    subTitle = "Oculus Quest is our first all-in-one gaming system built for virtual reality.",
    offerPrice = "₹28000",
    actualPrice = "₹ 35000",
    image = "https://images.pexels.com/photos/3761125/pexels-photo-3761125.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
)

val product5 = Products(
    id = 5,
    title = "Ray-Ban",
    subTitle = "Unisex Aviator Sunglasses 0RB3584N91400R58",
    offerPrice = "₹8547",
    actualPrice = "₹ 11000",
    image = "https://images.pexels.com/photos/1493112/pexels-photo-1493112.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
)

val product6 = Products(
    id = 6,
    title = "See and Wear",
    subTitle = "Formal Lace Up Oxford Goodyear Welted Shoes for Men",
    offerPrice = "₹5560",
    actualPrice = "₹ 8000",
    image = "https://images.pexels.com/photos/292999/pexels-photo-292999.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
)

val product7 = Products(
    id = 7,
    title = "Mast & Harbour",
    subTitle = "H:30cm W:33cm D:14cm",
    offerPrice = "₹2500",
    actualPrice = "₹ 4500",
    image = "https://images.pexels.com/photos/2081199/pexels-photo-2081199.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
)

val product8 = Products(
    id = 8,
    title = "Antony Morato",
    subTitle = "The model (height 6') is wearing a size M",
    offerPrice = "₹3500",
    actualPrice = "₹ 5000",
    image = "https://images.pexels.com/photos/3026283/pexels-photo-3026283.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
)

val product9 = Products(
    id = 9,
    title = "Polo Ralph Lauren",
    subTitle = "The model (height 6') is wearing a size M",
    offerPrice = "₹9425",
    actualPrice = "₹ 12500",
    image = "https://images.pexels.com/photos/769733/pexels-photo-769733.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
)

val product10 = Products(
    id = 10,
    title = "Cherry Crumble",
    subTitle = "Fluorescent yellow solid padded jacket, 4 pockets, zip closure, long sleeves, curved hem, and unlined",
    offerPrice = "₹7546",
    actualPrice = "₹ 10000",
    image = "https://images.pexels.com/photos/1317712/pexels-photo-1317712.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"
)

val product11 = Products(
    id = 11,
    title = "Mr Barber",
    subTitle = "Mr. Barber Unisex Black Power Play 2500 Hair Dryer MB-PP2500",
    offerPrice = "₹3200",
    actualPrice = "₹ 5600",
    image = "https://images.pexels.com/photos/973406/pexels-photo-973406.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
)

val products = arrayListOf(product1, product2, product3, product4, product5, product6,
                    product7, product8, product9, product10, product11)