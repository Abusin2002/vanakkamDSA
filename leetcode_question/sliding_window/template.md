# 🔥 Sliding Window Templates (FAANG Cheat Sheet)

---

# 🧠 CORE IDEA (VERY IMPORTANT)

Sliding Window always follows this flow:

1. Expand right pointer
2. Add element to data structure
3. While window is invalid → shrink from left
4. Update answer

---

# 🔥 1. VARIABLE SIZE SLIDING WINDOW (MOST IMPORTANT)

## 👉 Use when:
- longest / maximum / minimum subarray or substring
- “at most K …”
- “at least K …”
- “distinct elements constraint”

---

## 🧠 TEMPLATE (HashMap version)

```java
Map<Integer, Integer> map = new HashMap<>();

int left = 0;
int result = 0;

for (int right = 0; right < n; right++) {

    // 1. Add right element
    map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

    // 2. Fix window if invalid
    while (INVALID_CONDITION) {

        map.put(arr[left], map.get(arr[left]) - 1);

        if (map.get(arr[left]) == 0) {
            map.remove(arr[left]);
        }

        left++;
    }

    // 3. Update answer
    result = Math.max(result, right - left + 1);
}

return result;

```
# 🔥 2. FIXED SIZE SLIDING WINDOW
## 👉 Use when:
- window size is fixed (k)
- sum / max / min of size k

## Template
```declarative
int sum = 0;

// first window
for (int i = 0; i < k; i++) {
    sum += arr[i];
}

int result = sum;

// slide window
for (int i = k; i < n; i++) {

    sum += arr[i];       // add new element
    sum -= arr[i - k];   // remove old element

    result = Math.max(result, sum);
}

return result;

```

# 🔥 3. TWO POINTER (SPECIAL SLIDING WINDOW)
## 👉 Use when:
- sorted array
- pair problems
- remove duplicates
- reverse / condition checking

## Template

```declarative
int left = 0;
int right = n - 1;

while (left < right) {

    if (CONDITION) {
        left++;
    } else {
        right--;
    }
}
```


# 🔥 5. FREQUENCY ARRAY TEMPLATE (FAST)
## 👉 Use when:
- only characters (A–Z / a–z)
```declarative
int[] freq = new int[26];

int left = 0;

for (int right = 0; right < n; right++) {

    freq[arr[right] - 'A']++;

    while (INVALID_CONDITION) {

        freq[arr[left] - 'A']--;
        left++;
    }
}
```


## 🧠 FINAL INTERVIEW TRICK (VERY IMPORTANT)
## Identify pattern in 5 seconds:
🔵 “longest / maximum / minimum”

→ Sliding Window

🔵 “substring / subarray (continuous)”

→ Sliding Window

🔵 “at most K / distinct”

→ HashMap + shrink window

🔵 “fixed size K”

→ fixed window sum

## MASTER FLOW (MEMORIZE THIS)

```dtd
Expand right
→ Add element
→ While invalid shrink left
→ Update answer
```