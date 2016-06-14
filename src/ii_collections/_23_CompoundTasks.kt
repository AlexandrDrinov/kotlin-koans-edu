package ii_collections

fun checkCustomer(customer: Customer, product: Product): Boolean =
        customer.orders.filter { it.products.contains(product) }.size > 0

fun Shop.getCustomersWhoOrderedProduct(product: Product): Set<Customer> =
        customers.filter { checkCustomer(it, product) }.toSet()

fun Customer.getMostExpensiveDeliveredProduct(): Product? =
        orders.filter { it.isDelivered }.flatMap { it.products }.maxBy { it.price }

fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int =
        customers.flatMap { it.orders.flatMap { it.products } }.count { it == product }


