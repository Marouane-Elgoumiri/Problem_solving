use std::collections::HashMap;

fn picking_numbers(a: &[i32]) -> i32 {
    let mut frequency = HashMap::new();

    // Populate the frequency map
    for &num in a.iter() {
        *frequency.entry(num).or_insert(0) += 1;
    }

    // Initialize the max length of subarray
    let mut max_count = 0;

    // Find the maximum length of subarray
    for (&key, &value) in frequency.iter() {
        let adj_count = value + frequency.get(&(key - 1)).unwrap_or(&0);
        if adj_count > max_count {
            max_count = adj_count;
        }
    }

    max_count
}

fn main() {
    let a = vec![4, 6, 5, 3, 3, 1];
    println!("{}", picking_numbers(&a)); // Output: 3
}
