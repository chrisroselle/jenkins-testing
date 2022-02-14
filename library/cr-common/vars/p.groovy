import groovy.transform.Field

// choice(name: 'example', description: p.example.description, choices: p.example.choices)
@Field example = [
    name: 'example',
    description: 'this is an example of a reusable parameter',
    choices: ['one', 'two']
]

// choice(name: 'example2', description: p.example2.description, choices: p.example2.choices)
@Field example2 = [
    name: 'example2',
    description: 'this is another reuseable parameter',
    choices: ['a', 'b']
]
