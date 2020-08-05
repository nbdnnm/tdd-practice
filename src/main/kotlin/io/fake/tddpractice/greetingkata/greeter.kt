package io.fake.tddpractice.greetingkata

fun greet(names: MutableList<String?>): String {
    var greeting = "Hello, "

    if (names.size == 1) {
        when {
            names[0] == null -> greeting += "my friend."
            names[0].equals(names[0]?.toUpperCase()) -> greeting = ("HELLO " + "${names[0]}!").toUpperCase()
            else -> greeting += "${names[0]}."
        }
    } else {
        val nameUpper: MutableList<String> = ArrayList()
        val iterate = names.listIterator()

        while (iterate.hasNext()) {
            val oldValue = iterate.next()
            if (oldValue == oldValue?.toUpperCase()) {
                nameUpper.add(oldValue!!.trim())
                iterate.remove()
            }
            if (oldValue!!.contains(",") && !oldValue.contains("\"")) {
                val commaNames = oldValue.split(",")
                iterate.remove()
                commaNames.forEach { iterate.add(it) }
            }
        }

        names.replaceAll { it!!.trim() }
        names.replaceAll { it!!.replace("\"", "") }

        if (names.size == 2) {
            greeting += "${names.get(0)} and ${names.get(1)}."
        } else if (names.size > 2) {
            for (index in 0..names.size - 2) {
                greeting += names[index] + ", "
            }
            greeting += "and " + names.last() + "."
        }
        nameUpper.forEach { name -> greeting += " AND HELLO $name!" }
    }
    return greeting
}
