function breakingRecords(scores) {
    let maxScore = scores[0];
    let minScore = scores[0];
    let minCount = 0;
    let maxCount = 0;
    for (let i = 1; i < scores.length; i++) {
        if (scores[i] > maxScore) {
            maxScore = scores[i];
            maxCount++;
        } else if (scores[i] < minScore) {
            minScore = scores[i];
            minCount++;
        }
    }

    return [maxCount, minCount];
}
function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const n = parseInt(readLine().trim(), 10);

    const scores = readLine().replace(/\s+$/g, '').split(' ').map(scoresTemp => parseInt(scoresTemp, 10));

    const result = breakingRecords(scores);

    ws.write(result.join(' ') + '\n');

    ws.end();
}
